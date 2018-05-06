package com.hdw.erp.common.dto.hr;

import java.sql.Date;

import com.hdw.erp.common.dto.config.DocumentDto;
import com.hdw.erp.common.dto.config.FileDto;

public class MedicalCertificateDto extends DocumentDto {
	// ประเภทใบรับรองแพทย์ (เข้ารับการตรวจ / เข้ารับการรักษาในโรงพยาบาล)
	private String medicalCertificateType;
	// สถานพยาบาล
	private String hospital;
	// แพทย์รับรองเริ่มวันที่
	private Date guaranteeDateStart;
	// แพทย์รับรองสิ้นสุดวันที่
	private Date guaranteeDateEnd;
	// สาเหตุและอาการ
	private String causesAndSymptoms;
	// ความเห็นแพทย์
	private String medicalOpinions;
	// ชื่อแพทย์ผู้รับรอง
	private String medicalCertification;
	// ใบแพทย์รับรองเลขที่
	private String medicalCertificateID;
	// ลงวันที่
	private Date certificateDate;
	// บันทึกเพิ่มเติม
	private String note;
	// รายการไฟล์แนบ
	private FileDto document;

	public String getMedicalCertificateType() {
		return medicalCertificateType;
	}

	public void setMedicalCertificateType(String medicalCertificateType) {
		this.medicalCertificateType = medicalCertificateType;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public Date getGuaranteeDateStart() {
		return guaranteeDateStart;
	}

	public void setGuaranteeDateStart(Date guaranteeDateStart) {
		this.guaranteeDateStart = guaranteeDateStart;
	}

	public Date getGuaranteeDateEnd() {
		return guaranteeDateEnd;
	}

	public void setGuaranteeDateEnd(Date guaranteeDateEnd) {
		this.guaranteeDateEnd = guaranteeDateEnd;
	}

	public String getCausesAndSymptoms() {
		return causesAndSymptoms;
	}

	public void setCausesAndSymptoms(String causesAndSymptoms) {
		this.causesAndSymptoms = causesAndSymptoms;
	}

	public String getMedicalOpinions() {
		return medicalOpinions;
	}

	public void setMedicalOpinions(String medicalOpinions) {
		this.medicalOpinions = medicalOpinions;
	}

	public String getMedicalCertification() {
		return medicalCertification;
	}

	public void setMedicalCertification(String medicalCertification) {
		this.medicalCertification = medicalCertification;
	}

	public String getMedicalCertificateID() {
		return medicalCertificateID;
	}

	public void setMedicalCertificateID(String medicalCertificateID) {
		this.medicalCertificateID = medicalCertificateID;
	}

	public Date getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(Date certificateDate) {
		this.certificateDate = certificateDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public FileDto getDocument() {
		return document;
	}

	public void setDocument(FileDto document) {
		this.document = document;
	}
}
