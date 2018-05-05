package com.hdw.erp.common.dto.hr;

import java.sql.Date;
import java.util.List;

import com.hdw.erp.common.dto.config.DocumentDto;
import com.hdw.erp.common.dto.config.FileDto;


public class CertificationDto extends DocumentDto {
	private Long id;
	// ชื่อใบรับรอง (ภาษาไทย)
	private String certificationNameTH;
	// ชื่อใบรับรอง (ภาษาอังกฤษ)
	private String certificationNameEN;
	// คำอธิบาย
	private String description;
	// หน่วยงานผู้รับรอง
	private String warrantor;
	// ออกให้เมื่อวันที่
	private Date offerDate;
	// ไฟล์แนบ
	private List<FileDto> documentList;
	
	//Added
	private Long personnelRecordId;
	
	public String getCertificationNameTH() {
		return certificationNameTH;
	}
	public void setCertificationNameTH(String certificationNameTH) {
		this.certificationNameTH = certificationNameTH;
	}
	public String getCertificationNameEN() {
		return certificationNameEN;
	}
	public void setCertificationNameEN(String certificationNameEN) {
		this.certificationNameEN = certificationNameEN;
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
	public Long getPersonnelRecordId() {
		return personnelRecordId;
	}
	public void setPersonnelRecordId(Long personnelRecordId) {
		this.personnelRecordId = personnelRecordId;
	}
}
