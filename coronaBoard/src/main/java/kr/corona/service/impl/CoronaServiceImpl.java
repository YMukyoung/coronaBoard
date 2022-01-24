package kr.corona.service.impl;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import kr.corona.dto.response.infection.InfectionVO;
import kr.corona.service.CoronaService;

@Service
public class CoronaServiceImpl implements CoronaService{
	@Value("${corona.infection.request.url}")
	private String infectionRequestUrl;
	
	@Value("${corona.infection.serviceKey}")
	private String infectionServiceKey;
	
	public void getCoronaInfection() throws UnsupportedEncodingException  {
	    UriComponents requestUri = UriComponentsBuilder.fromHttpUrl(infectionRequestUrl)
	                .queryParam("serviceKey", infectionServiceKey)
	                .build(true);   		

        RestTemplate restTemplate = new RestTemplateBuilder().build();
        InfectionVO response = restTemplate.getForObject(requestUri.toUri(), InfectionVO.class);

        System.out.println(requestUri.toUri());
		System.out.println(response);
	}
}
