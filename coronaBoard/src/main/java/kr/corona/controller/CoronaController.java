package kr.corona.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.corona.dto.response.infection.InfectionResponseVO;
import kr.corona.service.CoronaService;

@RestController
@RequestMapping("/corona")
public class CoronaController {

	@Autowired
	private CoronaService coronaService;
	
	@RequestMapping("/infection")
	public InfectionResponseVO corona1() throws UnsupportedEncodingException {
		return coronaService.getCoronaInfection();
	}
	
	@RequestMapping("/corona2")
	public String corona2() {
		return "corona1";
	}
}
