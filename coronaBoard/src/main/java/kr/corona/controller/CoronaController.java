package kr.corona.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.corona.service.CoronaService;

@RestController
@RequestMapping("/corona/*")
public class CoronaController {

	@Autowired
	private CoronaService coronaService;
	
	@RequestMapping("/corona1")
	public String corona1() throws UnsupportedEncodingException {
		coronaService.getCoronaInfection();
		return "corona1";
	}
	
	@RequestMapping("/corona2")
	public String corona2() {
		return "corona1";
	}
}
