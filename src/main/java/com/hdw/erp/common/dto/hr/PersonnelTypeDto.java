package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class PersonnelTypeDto extends ERPBaseDto {
	private Long id;
	
	private String personnelTypeCode;
	// ชื่อประเภทพนักงาน (ภาษาไทย)
	private String personnelTypeNameTH;
	// ชื่อประเภทพนักงาน (ภาษาอังกฤษ)
	private String personnelTypeNameEN;
	// คำอธิบาย
	private String personnelTypeDetail;

	private String activeFlag;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonnelTypeCode() {
		return personnelTypeCode;
	}

	public void setPersonnelTypeCode(String personnelTypeCode) {
		this.personnelTypeCode = personnelTypeCode;
	}

	public String getPersonnelTypeNameTH() {
		return personnelTypeNameTH;
	}

	public void setPersonnelTypeNameTH(String personnelTypeNameTH) {
		this.personnelTypeNameTH = personnelTypeNameTH;
	}

	public String getPersonnelTypeNameEN() {
		return personnelTypeNameEN;
	}

	public void setPersonnelTypeNameEN(String personnelTypeNameEN) {
		this.personnelTypeNameEN = personnelTypeNameEN;
	}

	public String getPersonnelTypeDetail() {
		return personnelTypeDetail;
	}

	public void setPersonnelTypeDetail(String personnelTypeDetail) {
		this.personnelTypeDetail = personnelTypeDetail;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	
}
