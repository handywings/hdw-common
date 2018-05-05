package com.hdw.erp.common.dto.org;

import com.hdw.erp.common.dto.ERPBaseDto;

public class ShiftWorkLineDto extends ERPBaseDto {
	
	private Long id;
	// รหัส
	private int shiftWorkLineId;
	// เวลาเริ่ม
	private String timeWorkStart;
	// เวลาสิ้นสุด
	private String timeWorkEnd;

	// เวลาเริ่มพัก
	private String timeBreakStart;
	// เวลาสิ้นสุดการพัก
	private String timeBreakEnd;
	
	
	// สแกนก่อนได้ (นาที)
	private int BeforeMinuteTimeWorkStart;
	// เข้าช้าได้ (นาที)
	private int lateMinute;
	// ออกก่อนได้ (นาที)
	private int BeforeMinuteTimeWorkEnd;

	// อาเรย์วันทำงาน
	private boolean[] daywork = new boolean[7];

	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getBeforeMinuteTimeWorkStart() {
		return BeforeMinuteTimeWorkStart;
	}

	public void setBeforeMinuteTimeWorkStart(int beforeMinuteTimeWorkStart) {
		BeforeMinuteTimeWorkStart = beforeMinuteTimeWorkStart;
	}

	public int getLateMinute() {
		return lateMinute;
	}

	public void setLateMinute(int lateMinute) {
		this.lateMinute = lateMinute;
	}

	public int getBeforeMinuteTimeWorkEnd() {
		return BeforeMinuteTimeWorkEnd;
	}

	public void setBeforeMinuteTimeWorkEnd(int beforeMinuteTimeWorkEnd) {
		BeforeMinuteTimeWorkEnd = beforeMinuteTimeWorkEnd;
	}

	public String getTimeWorkStart() {
		return timeWorkStart;
	}

	public void setTimeWorkStart(String timeWorkStart) {
		this.timeWorkStart = timeWorkStart;
	}

	public String getTimeWorkEnd() {
		return timeWorkEnd;
	}

	public void setTimeWorkEnd(String timeWorkEnd) {
		this.timeWorkEnd = timeWorkEnd;
	}

	public String getTimeBreakStart() {
		return timeBreakStart;
	}

	public void setTimeBreakStart(String timeBreakStart) {
		this.timeBreakStart = timeBreakStart;
	}

	public String getTimeBreakEnd() {
		return timeBreakEnd;
	}

	public void setTimeBreakEnd(String timeBreakEnd) {
		this.timeBreakEnd = timeBreakEnd;
	}

	public boolean[] getDaywork() {
		return daywork;
	}

	public void setDaywork(boolean[] daywork) {
		this.daywork = daywork;
	}

	public int getShiftWorkLineId() {
		return shiftWorkLineId;
	}

	public void setShiftWorkLineId(int shiftWorkLineId) {
		this.shiftWorkLineId = shiftWorkLineId;
	}
}
