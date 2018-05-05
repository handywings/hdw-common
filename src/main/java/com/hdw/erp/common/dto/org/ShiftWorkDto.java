package com.hdw.erp.common.dto.org;

import java.util.List;

import com.hdw.erp.common.dto.ERPBaseDto;

public class ShiftWorkDto extends ERPBaseDto {
	private Long id;
	// รหัสกะงาน
	private int shiftWorkId;
	// ชื่อกะงาน (ภาษาไทย)
	private String shiftWorkNameTH;
	// ชื่อกะงาน (ภาษาอังกฤษ)
	private String shiftWorkNameEN;
	// คำอธิบายรายละเอียดของกะงาน
	private String shiftWorkDescription;
	// รายการเวลาทำงาน
	private List<ShiftWorkLineDto> shiftWorkLine;
	// ประเภทกะงาน (กะทำงานปกติ / กะทำงานล่วงเวลา)
	private String shiftWorkType;
	
	//Added
	private Long personnelEmploymentId;
	
	public int getShiftWorkId() {
		return shiftWorkId;
	}
	public void setShiftWorkId(int shiftWorkId) {
		this.shiftWorkId = shiftWorkId;
	}
	public String getShiftWorkNameTH() {
		return shiftWorkNameTH;
	}
	public void setShiftWorkNameTH(String shiftWorkNameTH) {
		this.shiftWorkNameTH = shiftWorkNameTH;
	}
	public String getShiftWorkNameEN() {
		return shiftWorkNameEN;
	}
	public void setShiftWorkNameEN(String shiftWorkNameEN) {
		this.shiftWorkNameEN = shiftWorkNameEN;
	}
	public String getShiftWorkDescription() {
		return shiftWorkDescription;
	}
	public void setShiftWorkDescription(String shiftWorkDescription) {
		this.shiftWorkDescription = shiftWorkDescription;
	}
	public List<ShiftWorkLineDto> getShiftWorkLine() {
		return shiftWorkLine;
	}
	public void setShiftWorkLine(List<ShiftWorkLineDto> shiftWorkLine) {
		this.shiftWorkLine = shiftWorkLine;
	}
	public String getShiftWorkType() {
		return shiftWorkType;
	}
	public void setShiftWorkType(String shiftWorkType) {
		this.shiftWorkType = shiftWorkType;
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
