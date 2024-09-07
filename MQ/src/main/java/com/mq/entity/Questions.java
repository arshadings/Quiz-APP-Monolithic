package com.mq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Questions {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer ID;
	private String CATEGORY;
	private String DIFFICULTYLEVEL;
	private String QUESTIONTITLE;
	private String OPTION1;
	private String OPTION2;
	private String OPTION3;
	private String OPTION4;
	private String ANSWER;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getCATEGORY() {
		return CATEGORY;
	}
	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}
	public String getDIFFICULTYLEVEL() {
		return DIFFICULTYLEVEL;
	}
	public void setDIFFICULTYLEVEL(String dIFFICULTYLEVEL) {
		DIFFICULTYLEVEL = dIFFICULTYLEVEL;
	}
	public String getQUESTIONTITLE() {
		return QUESTIONTITLE;
	}
	public void setQUESTIONTITLE(String qUESTIONTITLE) {
		QUESTIONTITLE = qUESTIONTITLE;
	}
	public String getOPTION1() {
		return OPTION1;
	}
	public void setOPTION1(String oPTION1) {
		OPTION1 = oPTION1;
	}
	public String getOPTION2() {
		return OPTION2;
	}
	public void setOPTION2(String oPTION2) {
		OPTION2 = oPTION2;
	}
	public String getOPTION3() {
		return OPTION3;
	}
	public void setOPTION3(String oPTION3) {
		OPTION3 = oPTION3;
	}
	public String getOPTION4() {
		return OPTION4;
	}
	public void setOPTION4(String oPTION4) {
		OPTION4 = oPTION4;
	}
	public String getANSWER() {
		return ANSWER;
	}
	public void setANSWER(String aNSWER) {
		ANSWER = aNSWER;
	}
	@Override
	public String toString() {
		return "Questions [ID=" + ID + ", CATEGORY=" + CATEGORY + ", DIFFICULTYLEVEL=" + DIFFICULTYLEVEL
				+ ", QUESTIONTITLE=" + QUESTIONTITLE + ", OPTION1=" + OPTION1 + ", OPTION2=" + OPTION2 + ", OPTION3="
				+ OPTION3 + ", OPTION4=" + OPTION4 + ", ANSWER=" + ANSWER + "]";
	}

}
