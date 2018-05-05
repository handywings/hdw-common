package com.hdw.erp.common.dto.config;

import com.hdw.erp.common.dto.ERPBaseDto;

public class DocumentStatusDto extends ERPBaseDto {
	// รหัสสถานะ
	private int statusId;
	// ชื่อสถานะ
	private String statusName;
	// คำอธิบายสถานะ
	private String statusDetail;
	// icon
	private String statusIcon;
	// สีอักษร
	private String statusColor;
	// ประเภทสถานะ (Example : สถานะเอกสาร, สถานะบัตรสมาชิก, สถานะสินค้า)
	private StatusTypeDto statusType;

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusDetail() {
		return statusDetail;
	}

	public void setStatusDetail(String statusDetail) {
		this.statusDetail = statusDetail;
	}

	public String getStatusIcon() {
		return statusIcon;
	}

	public void setStatusIcon(String statusIcon) {
		this.statusIcon = statusIcon;
	}

	public String getStatusColor() {
		return statusColor;
	}

	public void setStatusColor(String statusColor) {
		this.statusColor = statusColor;
	}

	public StatusTypeDto getStatusType() {
		return statusType;
	}

	public void setStatusType(StatusTypeDto statusType) {
		this.statusType = statusType;
	}
}
