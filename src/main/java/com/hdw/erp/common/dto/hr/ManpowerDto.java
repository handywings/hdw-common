package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;
import com.hdw.erp.common.dto.org.OrganizationDto;

public class ManpowerDto extends ERPBaseDto {
	private Long id;
	// ข้อมูลบริษัท
	private OrganizationDto organization;
	// จำนวนอัตราที่ต้องการ
	private int manpower;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OrganizationDto getOrganization() {
		return organization;
	}

	public void setOrganization(OrganizationDto organization) {
		this.organization = organization;
	}

	public int getManpower() {
		return manpower;
	}

	public void setManpower(int manpower) {
		this.manpower = manpower;
	}
}
