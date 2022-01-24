package kr.corona.dto.response.infection;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name="response")
public class InfectionResponseVO {
	
	private InfectionHeaderVO header;
	private InfectionBodyVO body;
}
