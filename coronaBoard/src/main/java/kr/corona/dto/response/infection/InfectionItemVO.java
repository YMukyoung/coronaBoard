package kr.corona.dto.response.infection;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="item")
public class InfectionItemVO {
	
	private double accDefRate;
	private int accExamCnt;
	private int accExamCompCnt;
	private int careCnt;
	private int clearCnt;
    private int deathCnt;
    private int decideCnt;
    private int examCnt;
    private int resutlNegCnt;
    private int seq;
    private String stateDt;
}
