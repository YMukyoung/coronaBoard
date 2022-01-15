package kr.corona.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/corona/*")
public class CoronaController {

	@RequestMapping("/corona1")
	public String corona1() {
		return "corona1";
	}
	@RequestMapping("/corona2")
	public String corona2() {
		return "corona1";
	}
}
