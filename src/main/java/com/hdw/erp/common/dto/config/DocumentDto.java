package com.hdw.erp.common.dto.config;

import java.sql.Date;
import java.util.List;

import com.hdw.erp.common.dto.ERPBaseDto;

public class DocumentDto extends ERPBaseDto {
	// รหัสเอกสาร
	private Long documentId;
	// เลขทะเบียนเอกสาร
	private String documentNumber;
	// วันที่เอกสาร
	private Date documentDate;
	// ประเภทเอกสาร
	private DocumentTypeDto documentType;
	// เอกสารด่วนหรือไม่ T / F
	private boolean isImportunate;
	// บันทึกเพิ่มเติมเกี่ยวกับสถานะเอกสาร
	private String documentStatusDescription;
	// ประวัติการปรับสถานะเอกสาร
	private List<ERPBaseDto> documentStatusHistory;
	// ประวัติการปรับปรุงข้อมูล
	private List<UpdateDetailDto> updateHistory;
	
	public Long getDocumentId() {
		return documentId;
	}
	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public Date getDocumentDate() {
		return documentDate;
	}
	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}
	public DocumentTypeDto getDocumentType() {
		return documentType;
	}
	public void setDocumentType(DocumentTypeDto documentType) {
		this.documentType = documentType;
	}
	public boolean isImportunate() {
		return isImportunate;
	}
	public void setImportunate(boolean isImportunate) {
		this.isImportunate = isImportunate;
	}
	public String getDocumentStatusDescription() {
		return documentStatusDescription;
	}
	public void setDocumentStatusDescription(String documentStatusDescription) {
		this.documentStatusDescription = documentStatusDescription;
	}
	public List<ERPBaseDto> getDocumentStatusHistory() {
		return documentStatusHistory;
	}
	public void setDocumentStatusHistory(List<ERPBaseDto> documentStatusHistory) {
		this.documentStatusHistory = documentStatusHistory;
	}
	public List<UpdateDetailDto> getUpdateHistory() {
		return updateHistory;
	}
	public void setUpdateHistory(List<UpdateDetailDto> updateHistory) {
		this.updateHistory = updateHistory;
	}
}
