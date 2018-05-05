package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class EmployeeLevelDto extends ERPBaseDto{
	private Long id;
	private String employeeLevelCode;
	private String employeeLevelTh;
	private String employeeLevelEn;
	private String employeeLevelDescription;
	private String activeFlag;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeLevelCode() {
		return employeeLevelCode;
	}
	public void setEmployeeLevelCode(String employeeLevelCode) {
		this.employeeLevelCode = employeeLevelCode;
	}
	public String getEmployeeLevelTh() {
		return employeeLevelTh;
	}
	public void setEmployeeLevelTh(String employeeLevelTh) {
		this.employeeLevelTh = employeeLevelTh;
	}
	public String getEmployeeLevelEn() {
		return employeeLevelEn;
	}
	public void setEmployeeLevelEn(String employeeLevelEn) {
		this.employeeLevelEn = employeeLevelEn;
	}
	public String getEmployeeLevelDescription() {
		return employeeLevelDescription;
	}
	public void setEmployeeLevelDescription(String employeeLevelDescription) {
		this.employeeLevelDescription = employeeLevelDescription;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
}
