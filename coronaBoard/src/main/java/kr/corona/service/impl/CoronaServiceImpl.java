package kr.corona.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import kr.corona.service.CoronaService;

@Service
public class CoronaServiceImpl implements CoronaService{
	@Value("${corona.infection.request.url}")
	private String infectionRequestUrl;
	
	@Value("${corona.infection.serviceKey}")
	private String infectionServiceKey;
	
	public void getCoronaInfection() throws UnsupportedEncodingException {
		infectionServiceKey = URLDecoder.decode(infectionServiceKey, "UTF-8");
		
		StringBuilder requestUrl = new StringBuilder();
		requestUrl.append(infectionRequestUrl); /*Service Key*/
		requestUrl.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=" + URLEncoder.encode(infectionServiceKey, "UTF-8")); /*Service Key*/
		requestUrl.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
		requestUrl.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        requestUrl.append("&" + URLEncoder.encode("startCreateDt","UTF-8") + "=" + URLEncoder.encode("20200310", "UTF-8")); /*검색할 생성일 범위의 시작*/
        requestUrl.append("&" + URLEncoder.encode("endCreateDt","UTF-8") + "=" + URLEncoder.encode("20200315", "UTF-8")); /*검색할 생성일 범위의 종료*/
		
		System.out.println(requestUrl.toString());
		RestTemplate restTemplete = new RestTemplateBuilder().build();
		String response = restTemplete.getForObject(requestUrl.toString(), String.class);
		System.out.println(response);
		System.out.println("신수아 바보");
	}
}
