package com.hdw.erp.common.dto.hr;

import java.sql.Date;
import java.util.List;

import com.hdw.erp.common.dto.ERPBaseDto;
import com.hdw.erp.common.dto.config.FileDto;

public class WorkmanshipDto extends ERPBaseDto {
	private Long id;
	// ชื่อผลงาน (ภาษาไทย)
	private String workmanshipNameTH;
	// ชื่อผลงาน (ภาษาอังกฤษ)
	private String workmanshipNameEN;
	// คำอธิบาย
	private String description;
	// หน่วยงานผู้รับรอง
	private String warrantor;
	// ออกให้เมื่อวันที่
	private Date offerDate;
	// ไฟล์แนบ
	private List<FileDto> documentList;
	
	//Added
	private Long personnelId;
	
	public String getWorkmanshipNameTH() {
		return workmanshipNameTH;
	}
	public void setWorkmanshipNameTH(String workmanshipNameTH) {
		this.workmanshipNameTH = workmanshipNameTH;
	}
	public String getWorkmanshipNameEN() {
		return workmanshipNameEN;
	}
	public void setWorkmanshipNameEN(String workmanshipNameEN) {
		this.workmanshipNameEN = workmanshipNameEN;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWarrantor() {
		return warrantor;
	}
	public void setWarrantor(String warrantor) {
		this.warrantor = warrantor;
	}
	public Date getOfferDate() {
		return offerDate;
	}
	public void setOfferDate(Date offerDate) {
		this.offerDate = offerDate;
	}
	public List<FileDto> getDocumentList() {
		return documentList;
	}
	public void setDocumentList(List<FileDto> documentList) {
		this.documentList = documentList;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPersonnelId() {
		return personnelId;
	}
	public void setPersonnelId(Long personnelId) {
		this.personnelId = personnelId;
	}
}
