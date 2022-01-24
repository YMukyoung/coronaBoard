package kr.corona.dto.response.infection;

import lombok.Data;

@Data
public class InfectionResponseVO {
	
	public InfectionHeaderVO header;
	public InfectionBodyVO body;
}
