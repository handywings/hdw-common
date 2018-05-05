package com.hdw.erp.common.dto.config;

import com.hdw.erp.common.dto.ERPBaseDto;

public class FileTypeDto extends ERPBaseDto {
	private Long id;
	// ชื่อสถานะ
	private String fileTypeName;
	// คำอธิบายสถานะ
	private String fileTypeDetail;
	// icon or image pathfile
	private String fileTypeIcon;

	public String getFileTypeName() {
		return fileTypeName;
	}

	public void setFileTypeName(String fileTypeName) {
		this.fileTypeName = fileTypeName;
	}

	public String getFileTypeDetail() {
		return fileTypeDetail;
	}

	public void setFileTypeDetail(String fileTypeDetail) {
		this.fileTypeDetail = fileTypeDetail;
	}

	public String getFileTypeIcon() {
		return fileTypeIcon;
	}

	public void setFileTypeIcon(String fileTypeIcon) {
		this.fileTypeIcon = fileTypeIcon;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
