package com.creditcardstatement.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CREDITCARD")
public class CreditCard {

	@Id
	private Long ID;
	
	@Size(max = 250)
	private String Name;
	
	@Size(max = 250)
	private Long LIMIT_BAL;
	
	@Size(max = 250)
	private Long SEX;
	
	@Size(max = 250)
	private Long EDUCATION;
	
	@Size(max = 250)
	private Long MARRIAGE;
	
	@Size(max = 250)
	private Long AGE;
	
	@Size(max = 250)
	private Long PAY_1;
	
	@Size(max = 250)
	private Long PAY_2;
	private Long PAY_3;
	private Long PAY_4;
	private Long PAY_5;
	private Long PAY_6;
	private Long BILL_AMT1;
	private Long BILL_AMT2;
	private Long BILL_AMT3;
	private Long BILL_AMT4;
	private Long BILL_AMT5;
	private Long BILL_AMT6;
	private Long PAY_AMT1;
	private Long PAY_AMT2;
	private Long PAY_AMT3;
	private Long PAY_AMT4;
	private Long PAY_AMT5;
	private Long PAY_AMT6;
	private Long DEFAULT_PAYMENT_NEXTMONTH;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getLIMIT_BAL() {
		return LIMIT_BAL;
	}
	public void setLIMIT_BAL(Long lIMIT_BAL) {
		LIMIT_BAL = lIMIT_BAL;
	}
	public Long getSEX() {
		return SEX;
	}
	public void setSEX(Long sEX) {
		SEX = sEX;
	}
	public Long getEDUCATION() {
		return EDUCATION;
	}
	public void setEDUCATION(Long eDUCATION) {
		EDUCATION = eDUCATION;
	}
	public Long getMARRIAGE() {
		return MARRIAGE;
	}
	public void setMARRIAGE(Long mARRIAGE) {
		MARRIAGE = mARRIAGE;
	}
	public Long getAGE() {
		return AGE;
	}
	public void setAGE(Long aGE) {
		AGE = aGE;
	}
	public Long getPAY_1() {
		return PAY_1;
	}
	public void setPAY_1(Long pAY_1) {
		PAY_1 = pAY_1;
	}
	public Long getPAY_2() {
		return PAY_2;
	}
	public void setPAY_2(Long pAY_2) {
		PAY_2 = pAY_2;
	}
	public Long getPAY_3() {
		return PAY_3;
	}
	public void setPAY_3(Long pAY_3) {
		PAY_3 = pAY_3;
	}
	public Long getPAY_4() {
		return PAY_4;
	}
	public void setPAY_4(Long pAY_4) {
		PAY_4 = pAY_4;
	}
	public Long getPAY_5() {
		return PAY_5;
	}
	public void setPAY_5(Long pAY_5) {
		PAY_5 = pAY_5;
	}
	public Long getPAY_6() {
		return PAY_6;
	}
	public void setPAY_6(Long pAY_6) {
		PAY_6 = pAY_6;
	}
	public Long getBILL_AMT1() {
		return BILL_AMT1;
	}
	public void setBILL_AMT1(Long bILL_AMT1) {
		BILL_AMT1 = bILL_AMT1;
	}
	public Long getBILL_AMT2() {
		return BILL_AMT2;
	}
	public void setBILL_AMT2(Long bILL_AMT2) {
		BILL_AMT2 = bILL_AMT2;
	}
	public Long getBILL_AMT3() {
		return BILL_AMT3;
	}
	public void setBILL_AMT3(Long bILL_AMT3) {
		BILL_AMT3 = bILL_AMT3;
	}
	public Long getBILL_AMT4() {
		return BILL_AMT4;
	}
	public void setBILL_AMT4(Long bILL_AMT4) {
		BILL_AMT4 = bILL_AMT4;
	}
	public Long getBILL_AMT5() {
		return BILL_AMT5;
	}
	public void setBILL_AMT5(Long bILL_AMT5) {
		BILL_AMT5 = bILL_AMT5;
	}
	public Long getBILL_AMT6() {
		return BILL_AMT6;
	}
	public void setBILL_AMT6(Long bILL_AMT6) {
		BILL_AMT6 = bILL_AMT6;
	}
	public Long getPAY_AMT1() {
		return PAY_AMT1;
	}
	public void setPAY_AMT1(Long pAY_AMT1) {
		PAY_AMT1 = pAY_AMT1;
	}
	public Long getPAY_AMT2() {
		return PAY_AMT2;
	}
	public void setPAY_AMT2(Long pAY_AMT2) {
		PAY_AMT2 = pAY_AMT2;
	}
	public Long getPAY_AMT3() {
		return PAY_AMT3;
	}
	public void setPAY_AMT3(Long pAY_AMT3) {
		PAY_AMT3 = pAY_AMT3;
	}
	public Long getPAY_AMT4() {
		return PAY_AMT4;
	}
	public void setPAY_AMT4(Long pAY_AMT4) {
		PAY_AMT4 = pAY_AMT4;
	}
	public Long getPAY_AMT5() {
		return PAY_AMT5;
	}
	public void setPAY_AMT5(Long pAY_AMT5) {
		PAY_AMT5 = pAY_AMT5;
	}
	public Long getPAY_AMT6() {
		return PAY_AMT6;
	}
	public void setPAY_AMT6(Long pAY_AMT6) {
		PAY_AMT6 = pAY_AMT6;
	}
	public Long getDEFAULT_PAYMENT_NEXTMONTH() {
		return DEFAULT_PAYMENT_NEXTMONTH;
	}
	public void setDEFAULT_PAYMENT_NEXTMONTH(Long dEFAULT_PAYMENT_NEXTMONTH) {
		DEFAULT_PAYMENT_NEXTMONTH = dEFAULT_PAYMENT_NEXTMONTH;
	}
	@Override
	public String toString() {
		return "CreditCardModel [ID=" + ID + ", Name=" + Name + ", LIMIT_BAL=" + LIMIT_BAL + ", SEX=" + SEX
				+ ", EDUCATION=" + EDUCATION + ", MARRIAGE=" + MARRIAGE + ", AGE=" + AGE + ", PAY_1=" + PAY_1
				+ ", PAY_2=" + PAY_2 + ", PAY_3=" + PAY_3 + ", PAY_4=" + PAY_4 + ", PAY_5=" + PAY_5 + ", PAY_6=" + PAY_6
				+ ", BILL_AMT1=" + BILL_AMT1 + ", BILL_AMT2=" + BILL_AMT2 + ", BILL_AMT3=" + BILL_AMT3 + ", BILL_AMT4="
				+ BILL_AMT4 + ", BILL_AMT5=" + BILL_AMT5 + ", BILL_AMT6=" + BILL_AMT6 + ", PAY_AMT1=" + PAY_AMT1
				+ ", PAY_AMT2=" + PAY_AMT2 + ", PAY_AMT3=" + PAY_AMT3 + ", PAY_AMT4=" + PAY_AMT4 + ", PAY_AMT5="
				+ PAY_AMT5 + ", PAY_AMT6=" + PAY_AMT6 + ", DEFAULT_PAYMENT_NEXTMONTH=" + DEFAULT_PAYMENT_NEXTMONTH
				+ "]";
	}
	
	
	
}
