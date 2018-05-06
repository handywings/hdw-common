package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.config.DocumentDto;

public class ApplicationFormDto extends DocumentDto {
	
	private Long id;
	
	// ข้อมูลบุคคล
	private PersonRecordDto person;

	// ประเภทใบสมัคร
	private String applicationFormType;
	
	public PersonRecordDto getPerson() {
		return person;
	}

	public void setPerson(PersonRecordDto person) {
		this.person = person;
	}
	public String getApplicationFormType() {
		return applicationFormType;
	}

	public void setApplicationFormType(String applicationFormType) {
		this.applicationFormType = applicationFormType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
