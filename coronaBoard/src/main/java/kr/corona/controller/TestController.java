package kr.corona.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String getHomePage(HttpServletRequest request, Model model) {
		model.addAttribute("message", "hello Spring boot");
		return "home";
	}
	
	@PostMapping("/board")
	public String home() {
		return "index";
	}
	
	@GetMapping("/naver/Map")
	public String getNaverMap() {
		return "naverMap";
	}
}