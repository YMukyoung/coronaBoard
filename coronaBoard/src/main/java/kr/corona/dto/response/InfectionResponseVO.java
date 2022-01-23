package kr.corona.dto.response;

import java.util.HashMap;

public class InfectionResponseVO {
	
	private Object response;
	private HashMap<String, String> header;
	private InfectionItemsVO body;
	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public void setHeader(HashMap<String, String> header) {
		this.header = header;
	}

	public void setBody(InfectionItemsVO body) {
		this.body = body;
	}

	
	public HashMap<String, String> getHeader(){
		return this.header;
	}
	
	public InfectionItemsVO getBody() {
		return this.body;
	}
}
