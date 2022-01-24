package kr.corona.dto.response.infection;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="header")
public class InfectionHeaderVO {
    private String resultCode;
    private String resultMsg;
}
