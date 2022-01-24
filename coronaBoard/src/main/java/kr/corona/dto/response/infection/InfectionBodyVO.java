package kr.corona.dto.response.infection;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="body")
public class InfectionBodyVO {
	public List<InfectionItemVO> items;

	@XmlElementWrapper(name="items")
	@XmlElement(name="item")
	public List<InfectionItemVO> getItems() {
		return items;
	}

	public void setItems(List<InfectionItemVO> items) {
		this.items = items;
	}
	
	
}
