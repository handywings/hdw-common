package com.hdw.erp.common.dto.config;

import com.hdw.erp.common.dto.ERPBaseDto;

public class StatusTypeDto extends ERPBaseDto {
	// ชื่อประเภทสถานะ
	private String statusTypeName;
	// คำอธิบายสถานะ
	private String statusTypeDescription;

	public String getStatusTypeName() {
		return statusTypeName;
	}

	public void setStatusTypeName(String statusTypeName) {
		this.statusTypeName = statusTypeName;
	}

	public String getStatusTypeDescription() {
		return statusTypeDescription;
	}

	public void setStatusTypeDescription(String statusTypeDescription) {
		this.statusTypeDescription = statusTypeDescription;
	}
}
