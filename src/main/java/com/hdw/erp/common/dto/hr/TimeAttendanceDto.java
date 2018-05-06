package com.hdw.erp.common.dto.hr;

import java.sql.Timestamp;

import com.hdw.erp.common.dto.ERPBaseDto;
import com.hdw.erp.common.dto.config.FileDto;

public class TimeAttendanceDto extends ERPBaseDto {
	// รูปภาพใบหน้าพนักงาน
	private FileDto image;
	// วันเวลาเข้างาน
	private Timestamp timeIn;
	// วันเวลาออกงาน
	private Timestamp timeOut;
	// หมายเลข Client IP Address
	private String ipAddress;
	// ตำแหน่ง latitude
	private String latitude;
	// ตำแหน่ง longitude
	private String longitude;
	// ชื่อตำแหน่ง (ดึงข้อมูลมาจาก Google Map)
	private String addressName;
	// อ้างอิงสัญญาว่าจ้างของพนักงาน
	private PersonnelEmploymentDto personnelEmployment;
	// จำนวนเวลาที่มาสาย
	private int hourLate;
	private int minuteLate;
	// จำนวนเวลาที่ออกงานก่อนกำหนด
	private int hourBefore;
	private int minuteBefore;

	public Timestamp getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(Timestamp timeIn) {
		this.timeIn = timeIn;
	}

	public Timestamp getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Timestamp timeOut) {
		this.timeOut = timeOut;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public FileDto getImage() {
		return image;
	}

	public void setImage(FileDto image) {
		this.image = image;
	}

	public PersonnelEmploymentDto getPersonnelEmployment() {
		return personnelEmployment;
	}

	public void setPersonnelEmployment(PersonnelEmploymentDto personnelEmployment) {
		this.personnelEmployment = personnelEmployment;
	}

	public int getHourLate() {
		return hourLate;
	}

	public void setHourLate(int hourLate) {
		this.hourLate = hourLate;
	}

	public int getMinuteLate() {
		return minuteLate;
	}

	public void setMinuteLate(int minuteLate) {
		this.minuteLate = minuteLate;
	}

	public int getHourBefore() {
		return hourBefore;
	}

	public void setHourBefore(int hourBefore) {
		this.hourBefore = hourBefore;
	}

	public int getMinuteBefore() {
		return minuteBefore;
	}

	public void setMinuteBefore(int minuteBefore) {
		this.minuteBefore = minuteBefore;
	}
}
