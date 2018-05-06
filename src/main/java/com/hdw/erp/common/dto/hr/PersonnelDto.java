package com.hdw.erp.common.dto.hr;

import java.util.List;

import com.hdw.erp.common.dto.ERPBaseDto;
import com.hdw.erp.common.dto.config.FileDto;

public class PersonnelDto extends ERPBaseDto {
	// รหัสพนักงาน
	private Long id;
	// เลขที่พนักงาน
	private String personnelNumber;
	// QRCODE
	private String qrcode;
	// ข้อมูลบุคคล
	private PersonRecordDto person;
	// ข้อมูลการว่าจ้าง (Personnel Employment)
	private PersonnelEmploymentDto personnelEmployment;
	// ข้อมูลสวัสดิการพนักงาน (Personnel Welfare)
	private PersonnelSocialSecurityDto socialsecurity;
	// ผลงานดีเด่นในองค์กร
	private List<WorkmanshipDto> workmanship;
	// รายการไฟล์หลักฐาน
	private List<FileDto> documentList;

	// สามารถเก็บประวัติพนักงานเก่าของบริษัทได้ เพื่อไม่จำเป็นต้องกรอกข้อมูลใหม่
	// แต่สามารถทำสัญญาว่าจ้างกี่ชุดก็ได้
	private List<PersonnelEmploymentDto> personnelEmploymentList;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonnelNumber() {
		return personnelNumber;
	}

	public void setPersonnelNumber(String personnelNumber) {
		this.personnelNumber = personnelNumber;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public PersonRecordDto getPerson() {
		return person;
	}

	public void setPerson(PersonRecordDto person) {
		this.person = person;
	}

	public PersonnelEmploymentDto getPersonnelEmployment() {
		return personnelEmployment;
	}

	public void setPersonnelEmployment(PersonnelEmploymentDto personnelEmployment) {
		this.personnelEmployment = personnelEmployment;
	}

	public PersonnelSocialSecurityDto getSocialsecurity() {
		return socialsecurity;
	}

	public void setSocialsecurity(PersonnelSocialSecurityDto socialsecurity) {
		this.socialsecurity = socialsecurity;
	}

	public List<FileDto> getDocumentList() {
		return documentList;
	}

	public void setDocumentList(List<FileDto> documentList) {
		this.documentList = documentList;
	}

	public List<PersonnelEmploymentDto> getPersonnelEmploymentList() {
		return personnelEmploymentList;
	}

	public void setPersonnelEmploymentList(List<PersonnelEmploymentDto> personnelEmploymentList) {
		this.personnelEmploymentList = personnelEmploymentList;
	}

	public List<WorkmanshipDto> getWorkmanship() {
		return workmanship;
	}

	public void setWorkmanship(List<WorkmanshipDto> workmanship) {
		this.workmanship = workmanship;
	}
}
