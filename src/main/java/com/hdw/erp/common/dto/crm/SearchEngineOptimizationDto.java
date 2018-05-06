package com.hdw.erp.common.dto.crm;

import com.hdw.erp.common.dto.ERPBaseDto;

public class SearchEngineOptimizationDto extends ERPBaseDto {
	private Long id;
	// หัวข้อ
	private String title;
	// คำค้นหลั�?
	private String[] keywords;
	// คำอธิบาย
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getKeywords() {
		return keywords;
	}
	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
