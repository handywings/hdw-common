package com.hdw.erp.common.dto.config;

import java.sql.Timestamp;

import com.hdw.erp.common.dto.ERPBaseDto;
import com.hdw.erp.common.dto.hr.PersonnelDto;


public class UpdateDetailDto extends ERPBaseDto {
	// วันที่ปรับปรุงเอกสารล่าสุด
	private Timestamp lastUpdate;
	// ผู้แก้ไขปรับปรุง
	private PersonnelDto editorPersonnel;

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public PersonnelDto getEditorPersonnel() {
		return editorPersonnel;
	}

	public void setEditorPersonnel(PersonnelDto editorPersonnel) {
		this.editorPersonnel = editorPersonnel;
	}
}
