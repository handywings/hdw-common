package com.hdw.erp.common.dto.hr;

import java.sql.Date;
import java.util.List;

import com.hdw.erp.common.dto.config.DocumentDto;
import com.hdw.erp.common.dto.config.FileDto;

public class LeaveDocumentDto extends DocumentDto {
	private Long id;
	// ประเภทการลา
	private LeaveTypeDto leaveType;
	// เหตุผลการลา
	private String cause;
	// หมายเลขโทรศัพท์ที่ติดต่อได้
	private String mobile;
	// วันเริ่มต้นลา
	private Date leaveDateStart;
	// เวลาเริ่มต้นลา
	private String leaveTimeStart;
	// วันสิ้นสุดการลา
	private Date leaveDateEnd;
	// เวลาสิ้นสุดการลา
	private String leaveTimeEnd;
	// ใบรับรองแพทย์ (Medical certificate)
	private MedicalCertificateDto medicalCertificate;
	// รายการกะงานที่ลา
	private List<LeaveLineDto> leaveLineList;
	// รายการไฟล์หลักฐานอื่นๆ
	private List<FileDto> documentList;
	// การลาเกิดขึ้นภายใต้สัญญาว่าจ้างใด
	private PersonnelEmploymentDto personnelEmployment;
	
	
	//Added
	private PersonnelDto personnelDto;
	
	public LeaveTypeDto getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveTypeDto leaveType) {
		this.leaveType = leaveType;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getLeaveDateStart() {
		return leaveDateStart;
	}
	public void setLeaveDateStart(Date leaveDateStart) {
		this.leaveDateStart = leaveDateStart;
	}
	public String getLeaveTimeStart() {
		return leaveTimeStart;
	}
	public void setLeaveTimeStart(String leaveTimeStart) {
		this.leaveTimeStart = leaveTimeStart;
	}
	public Date getLeaveDateEnd() {
		return leaveDateEnd;
	}
	public void setLeaveDateEnd(Date leaveDateEnd) {
		this.leaveDateEnd = leaveDateEnd;
	}
	public String getLeaveTimeEnd() {
		return leaveTimeEnd;
	}
	public void setLeaveTimeEnd(String leaveTimeEnd) {
		this.leaveTimeEnd = leaveTimeEnd;
	}
	public MedicalCertificateDto getMedicalCertificate() {
		return medicalCertificate;
	}
	public void setMedicalCertificate(MedicalCertificateDto medicalCertificate) {
		this.medicalCertificate = medicalCertificate;
	}
	public List<LeaveLineDto> getLeaveLineList() {
		return leaveLineList;
	}
	public void setLeaveLineList(List<LeaveLineDto> leaveLineList) {
		this.leaveLineList = leaveLineList;
	}
	public List<FileDto> getDocumentList() {
		return documentList;
	}
	public void setDocumentList(List<FileDto> documentList) {
		this.documentList = documentList;
	}
	public PersonnelEmploymentDto getPersonnelEmployment() {
		return personnelEmployment;
	}
	public void setPersonnelEmployment(PersonnelEmploymentDto personnelEmployment) {
		this.personnelEmployment = personnelEmployment;
	}
	public PersonnelDto getPersonnelDto() {
		return personnelDto;
	}
	public void setPersonnelDto(PersonnelDto personnelDto) {
		this.personnelDto = personnelDto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
