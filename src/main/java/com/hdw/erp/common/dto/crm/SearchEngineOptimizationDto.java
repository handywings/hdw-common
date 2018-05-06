package com.hdw.erp.common.dto.crm;

import com.hdw.erp.common.dto.ERPBaseDto;

public class SearchEngineOptimizationDto extends ERPBaseDto {
	// หัวข้อ
	private String title;
	// คำค้นหลั�?
	private String[] Keywords;
	// คำอธิบาย
	private String Description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getKeywords() {
		return Keywords;
	}

	public void setKeywords(String[] keywords) {
		Keywords = keywords;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
