package kr.corona.service;

import java.io.UnsupportedEncodingException;

import kr.corona.dto.response.infection.InfectionResponseVO;

public interface CoronaService {

	public InfectionResponseVO getCoronaInfection() throws UnsupportedEncodingException;
}