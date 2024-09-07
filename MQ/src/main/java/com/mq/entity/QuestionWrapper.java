package com.mq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuestionWrapper {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer ID;
	private String QUESTIONTITLE;
	private String OPTION1;
	private String OPTION2;
	private String OPTION3;
	private String OPTION4;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
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
	@Override
	public String toString() {
		return "QuestionWrapper [ID=" + ID + ", QUESTIONTITLE=" + QUESTIONTITLE + ", OPTION1=" + OPTION1 + ", OPTION2="
				+ OPTION2 + ", OPTION3=" + OPTION3 + ", OPTION4=" + OPTION4 + "]";
	}
	public QuestionWrapper(Integer iD, String qUESTIONTITLE, String oPTION1, String oPTION2, String oPTION3,
			String oPTION4) {
		super();
		ID = iD;
		QUESTIONTITLE = qUESTIONTITLE;
		OPTION1 = oPTION1;
		OPTION2 = oPTION2;
		OPTION3 = oPTION3;
		OPTION4 = oPTION4;
	}
	
}
