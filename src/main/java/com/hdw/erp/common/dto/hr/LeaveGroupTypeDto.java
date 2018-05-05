package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class LeaveGroupTypeDto extends ERPBaseDto {

	private Long id;
	// จำนวนวันที่อนุญาตลา
	private int limitDayLeave;
	private LeaveGroupDto leaveGroup;
	private LeaveTypeDto leaveType;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getLimitDayLeave() {
		return limitDayLeave;
	}
	public void setLimitDayLeave(int limitDayLeave) {
		this.limitDayLeave = limitDayLeave;
	}
	public LeaveGroupDto getLeaveGroup() {
		return leaveGroup;
	}
	public void setLeaveGroup(LeaveGroupDto leaveGroup) {
		this.leaveGroup = leaveGroup;
	}
	public LeaveTypeDto getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveTypeDto leaveType) {
		this.leaveType = leaveType;
	}
}
