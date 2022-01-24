package kr.corona.dto.response.infection;

import java.util.List;

import lombok.Data;

@Data
public class InfectionBodyVO {
	public List<InfectionItemVO> items;
}
