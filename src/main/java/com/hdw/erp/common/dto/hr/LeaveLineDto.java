package com.hdw.erp.common.dto.hr;

import java.sql.Date;

import com.hdw.erp.common.dto.ERPBaseDto;

public class LeaveLineDto extends ERPBaseDto {
	// วันที่ขอลา
	private Date leaveDate;
	// เวลาที่ลาเริ่มต้น
	private String leaveTimeStart;
	// เวลาที่ลาสิ้นสุด
	private String leaveTimeEnd;
	// จำนวนชั่วโมงที่ลา
	private int leaveHourNum;
	// จำนวนนาทีที่ลา
	private int leaveMinuteNum;

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public String getLeaveTimeStart() {
		return leaveTimeStart;
	}

	public void setLeaveTimeStart(String leaveTimeStart) {
		this.leaveTimeStart = leaveTimeStart;
	}

	public String getLeaveTimeEnd() {
		return leaveTimeEnd;
	}

	public void setLeaveTimeEnd(String leaveTimeEnd) {
		this.leaveTimeEnd = leaveTimeEnd;
	}

	public int getLeaveHourNum() {
		return leaveHourNum;
	}

	public void setLeaveHourNum(int leaveHourNum) {
		this.leaveHourNum = leaveHourNum;
	}

	public int getLeaveMinuteNum() {
		return leaveMinuteNum;
	}

	public void setLeaveMinuteNum(int leaveMinuteNum) {
		this.leaveMinuteNum = leaveMinuteNum;
	}
}
