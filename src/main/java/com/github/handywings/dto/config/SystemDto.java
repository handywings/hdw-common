package com.github.handywings.dto.config;

import java.util.List;

import com.github.handywings.dto.ERPBaseDto;

public class SystemDto extends ERPBaseDto {
	// รหัสโมดูล
	private int systemId;
	// ชื่อโมดูล (ภาษาไทย)
	private String systemNameTH;
	// ชื่อโมดูล (ภาษาอังกฤษ)
	private String systemNameEN;
	// รูปหรือไอคอน
	private String systemIcon;
	// คำอธิบายโมดูล
	private String systemDescription;
	// รายการโมดูล
	private List<ModuleDto> moduleList;
	
	public int getSystemId() {
		return systemId;
	}
	public void setSystemId(int systemId) {
		this.systemId = systemId;
	}
	public String getSystemNameTH() {
		return systemNameTH;
	}
	public void setSystemNameTH(String systemNameTH) {
		this.systemNameTH = systemNameTH;
	}
	public String getSystemNameEN() {
		return systemNameEN;
	}
	public void setSystemNameEN(String systemNameEN) {
		this.systemNameEN = systemNameEN;
	}
	public String getSystemIcon() {
		return systemIcon;
	}
	public void setSystemIcon(String systemIcon) {
		this.systemIcon = systemIcon;
	}
	public String getSystemDescription() {
		return systemDescription;
	}
	public void setSystemDescription(String systemDescription) {
		this.systemDescription = systemDescription;
	}
	public List<ModuleDto> getModuleList() {
		return moduleList;
	}
	public void setModuleList(List<ModuleDto> moduleList) {
		this.moduleList = moduleList;
	}
}
