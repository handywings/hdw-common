package com.github.handywings.dto.config;

import com.github.handywings.dto.ERPBaseDto;

public class StatusDto extends ERPBaseDto {
	// รหัสสถานะ
	private Long statusId;
	// ชื่อสถานะ
	private String statusName;
	// คำอธิบายสถานะ
	private String statusDetail;
	// icon
	private String statusIcon;
	// สีอักษร
	private String statusColor;
	// module
	private ModuleDto module;

	

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
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

	public ModuleDto getModule() {
		return module;
	}

	public void setModule(ModuleDto module) {
		this.module = module;
	}
}
