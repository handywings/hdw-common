package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class LeaveBalanceDto extends ERPBaseDto {
	private Long id;
	// ประเภทการลา
	private LeaveTypeDto leaveType;
	// วันลาคงเหลือ
	private int dayBalance;
	// ชั่วโมงลาคงเหลือ
	private int hourBalance;
	// นาทีลาคงเหลือ
	private int minuteBalance;

	//Added 
	private Long personnelEmploymentId;
	
	public LeaveTypeDto getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveTypeDto leaveType) {
		this.leaveType = leaveType;
	}

	public int getDayBalance() {
		return dayBalance;
	}

	public void setDayBalance(int dayBalance) {
		this.dayBalance = dayBalance;
	}

	public int getHourBalance() {
		return hourBalance;
	}

	public void setHourBalance(int hourBalance) {
		this.hourBalance = hourBalance;
	}

	public int getMinuteBalance() {
		return minuteBalance;
	}

	public void setMinuteBalance(int minuteBalance) {
		this.minuteBalance = minuteBalance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPersonnelEmploymentId() {
		return personnelEmploymentId;
	}

	public void setPersonnelEmploymentId(Long personnelEmploymentId) {
		this.personnelEmploymentId = personnelEmploymentId;
	}
}
