package kr.corona.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.corona.service.ClinicService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/corona")
public class ClinicApiController {
	
	private final ClinicService clinicService;
	
	@Value("${naver.client.id}")
	private String naverClientId;
	
	@GetMapping("/clinic/loc")
	public String getNaverMap(HttpServletRequest request, Model model) {
		List<String> address = clinicService.getClinicLoc();
		model.addAttribute("address", address);
		model.addAttribute("clientId", naverClientId);
		return "/page/naverMap";
	}
}