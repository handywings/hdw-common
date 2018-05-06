package com.hdw.erp.common.dto.config;

import com.hdw.erp.common.dto.ERPBaseDto;

public class DocumentTypeDto extends ERPBaseDto {
	// ชื่อประเภทเอกสาร (ภาษาไทย)
	private String documentTypeNameTH;
	// ชื่อประเภทเอกสาร (ภาษาอังกฤษ)
	private String documentTypeNameEN;
	// คำอธิบาย
	private String documentTypeDetail;
	// เอกสารอ้างอิงจากโมดูล
	private ModuleDto module;

	public String getDocumentTypeNameTH() {
		return documentTypeNameTH;
	}

	public void setDocumentTypeNameTH(String documentTypeNameTH) {
		this.documentTypeNameTH = documentTypeNameTH;
	}

	public String getDocumentTypeNameEN() {
		return documentTypeNameEN;
	}

	public void setDocumentTypeNameEN(String documentTypeNameEN) {
		this.documentTypeNameEN = documentTypeNameEN;
	}

	public String getDocumentTypeDetail() {
		return documentTypeDetail;
	}

	public void setDocumentTypeDetail(String documentTypeDetail) {
		this.documentTypeDetail = documentTypeDetail;
	}

	public ModuleDto getModule() {
		return module;
	}

	public void setModule(ModuleDto module) {
		this.module = module;
	}
}
