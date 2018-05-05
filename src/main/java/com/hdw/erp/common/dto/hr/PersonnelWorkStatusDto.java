package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class PersonnelWorkStatusDto extends ERPBaseDto{
	//รหัสสถานะการทำงาน
	private Long id;
	//ชื่อสถานะการทำงาน
	private String workStatusName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWorkStatusName() {
		return workStatusName;
	}
	public void setWorkStatusName(String workStatusName) {
		this.workStatusName = workStatusName;
	}
}
