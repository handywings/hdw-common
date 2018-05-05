package com.hdw.erp.common.dto.hr;

import java.util.List;

import com.hdw.erp.common.dto.ERPBaseDto;

public class LeaveGroupDto extends ERPBaseDto {
	private Long id;
	// รหัสกลุ่มลา
	private int leaveGroupId;
	// ชื่อกลุ่มลา (ภาษาไทย)
	private String leaveGroupNameTH;
	// ชื่อกลุ่มลา (ภาษาอังกฤษ)
	private String leaveGroupNameEN;
	// คำอธิบายกลุ่ม
	private String leaveGroupDetail;
	// เงื่อนไขการลาในแต่ละประเภท
	private List<LeaveGroupTypeDto> leaveGroupType;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getLeaveGroupId() {
		return leaveGroupId;
	}
	public void setLeaveGroupId(int leaveGroupId) {
		this.leaveGroupId = leaveGroupId;
	}
	public String getLeaveGroupNameTH() {
		return leaveGroupNameTH;
	}
	public void setLeaveGroupNameTH(String leaveGroupNameTH) {
		this.leaveGroupNameTH = leaveGroupNameTH;
	}
	public String getLeaveGroupNameEN() {
		return leaveGroupNameEN;
	}
	public void setLeaveGroupNameEN(String leaveGroupNameEN) {
		this.leaveGroupNameEN = leaveGroupNameEN;
	}
	public String getLeaveGroupDetail() {
		return leaveGroupDetail;
	}
	public void setLeaveGroupDetail(String leaveGroupDetail) {
		this.leaveGroupDetail = leaveGroupDetail;
	}
	public List<LeaveGroupTypeDto> getLeaveGroupType() {
		return leaveGroupType;
	}
	public void setLeaveGroupType(List<LeaveGroupTypeDto> leaveGroupType) {
		this.leaveGroupType = leaveGroupType;
	}
}
