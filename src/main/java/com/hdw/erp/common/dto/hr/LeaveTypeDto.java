package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class LeaveTypeDto extends ERPBaseDto {
	// รหัสประเภทการลา
	private Long leaveTypeId;
	
	private String leaveTypeNameCode;
	// ชื่อประเภทการลา (ภาษาไทย)
	private String leaveTypeNameTH;
	// ชื่อประเภทการลา (ภาษาอังกฤษ)
	private String leaveTypeNameEN;
	// จำนวนวันที่อนุญาตลา
	private int limitDayLeave;
	// รายละเอียดและคำอธิบายเพิ่มเติม
	private String leaveTypeDescription;
	
	private String activeFlag;
	
	public Long getLeaveTypeId() {
		return leaveTypeId;
	}
	public void setLeaveTypeId(Long leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}
	public String getLeaveTypeNameCode() {
		return leaveTypeNameCode;
	}
	public void setLeaveTypeNameCode(String leaveTypeNameCode) {
		this.leaveTypeNameCode = leaveTypeNameCode;
	}
	public String getLeaveTypeNameTH() {
		return leaveTypeNameTH;
	}
	public void setLeaveTypeNameTH(String leaveTypeNameTH) {
		this.leaveTypeNameTH = leaveTypeNameTH;
	}
	public String getLeaveTypeNameEN() {
		return leaveTypeNameEN;
	}
	public void setLeaveTypeNameEN(String leaveTypeNameEN) {
		this.leaveTypeNameEN = leaveTypeNameEN;
	}
	public int getLimitDayLeave() {
		return limitDayLeave;
	}
	public void setLimitDayLeave(int limitDayLeave) {
		this.limitDayLeave = limitDayLeave;
	}
	public String getLeaveTypeDescription() {
		return leaveTypeDescription;
	}
	public void setLeaveTypeDescription(String leaveTypeDescription) {
		this.leaveTypeDescription = leaveTypeDescription;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	
}
