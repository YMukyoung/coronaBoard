package kr.corona.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

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
    
	public double getAccDefRate() {
		return accDefRate;
	}
	public void setAccDefRate(double accDefRate) {
		this.accDefRate = accDefRate;
	}
	public int getAccExamCnt() {
		return accExamCnt;
	}
	public void setAccExamCnt(int accExamCnt) {
		this.accExamCnt = accExamCnt;
	}
	public int getAccExamCompCnt() {
		return accExamCompCnt;
	}
	public void setAccExamCompCnt(int accExamCompCnt) {
		this.accExamCompCnt = accExamCompCnt;
	}
	public int getCareCnt() {
		return careCnt;
	}
	public void setCareCnt(int careCnt) {
		this.careCnt = careCnt;
	}
	public int getClearCnt() {
		return clearCnt;
	}
	public void setClearCnt(int clearCnt) {
		this.clearCnt = clearCnt;
	}
	public int getDeathCnt() {
		return deathCnt;
	}
	public void setDeathCnt(int deathCnt) {
		this.deathCnt = deathCnt;
	}
	public int getDecideCnt() {
		return decideCnt;
	}
	public void setDecideCnt(int decideCnt) {
		this.decideCnt = decideCnt;
	}
	public int getExamCnt() {
		return examCnt;
	}
	public void setExamCnt(int examCnt) {
		this.examCnt = examCnt;
	}
	public int getResutlNegCnt() {
		return resutlNegCnt;
	}
	public void setResutlNegCnt(int resutlNegCnt) {
		this.resutlNegCnt = resutlNegCnt;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getStateDt() {
		return stateDt;
	}
	public void setStateDt(String stateDt) {
		this.stateDt = stateDt;
	}
}
