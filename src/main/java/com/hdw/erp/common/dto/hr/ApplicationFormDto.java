package com.hdw.erp.common.dto.hr;

import java.util.List;

import com.hdw.erp.common.dto.config.DocumentDto;
import com.hdw.erp.common.dto.org.OrganizationDto;
import com.hdw.erp.common.dto.org.PositionDto;

public class ApplicationFormDto extends DocumentDto {
	
	private Long id;
	
	// ข้อมูลบุคคล
	private PersonRecordDto person;

	// ประเภทใบสมัคร
	private String applicationFormType;
	
	// อ้างอิงประกาศสมัครงาน
	private PostJobDto postJob;
	
	//ตำแหน่งที่สมัคร
	private PositionDto positionDto;
	
	// สาขาที่เลือกลง
	private List<OrganizationDto> organizationList;
	
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

	public PostJobDto getPostJob() {
		return postJob;
	}

	public void setPostJob(PostJobDto postJob) {
		this.postJob = postJob;
	}

	public PositionDto getPositionDto() {
		return positionDto;
	}

	public void setPositionDto(PositionDto positionDto) {
		this.positionDto = positionDto;
	}

	public List<OrganizationDto> getOrganizationList() {
		return organizationList;
	}

	public void setOrganizationList(List<OrganizationDto> organizationList) {
		this.organizationList = organizationList;
	}
}
