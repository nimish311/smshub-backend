package com.example.smshub.model;

public class OperatorDetailsdto {
	
	private int operator_id;
	private String operator_name;
	private String mcc_mnc;
	private String country_name;
	
	public int getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(int operator_id) {
		this.operator_id = operator_id;
	}
	public String getOperator_name() {
		return operator_name;
	}
	public void setOperator_name(String operator_name) {
		this.operator_name = operator_name;
	}
	public String getMcc_mnc() {
		return mcc_mnc;
	}
	public void setMcc_mnc(String mcc_mnc) {
		this.mcc_mnc = mcc_mnc;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	
	
}
