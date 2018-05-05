package com.github.handywings.dto.config;

import java.util.List;

import com.github.handywings.dto.ERPBaseDto;

public class ModuleDto extends ERPBaseDto {
	private Long id;
	// รหัสโมดูล
	private int moduleId;
	// ชื่อโมดูล (ภาษาไทย)
	private String moduleNameTH;
	// ชื่อโมดูล (ภาษาอังกฤษ)
	private String moduleNameEN;
	// รูปหรือไอคอน
	private String moduleIcon;
	// คำอธิบายโมดูล
	private String moduleDescription;
	// รายการฟังก์ชัน
	private List<FunctionDto> functionList;
	
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleNameTH() {
		return moduleNameTH;
	}
	public void setModuleNameTH(String moduleNameTH) {
		this.moduleNameTH = moduleNameTH;
	}
	public String getModuleNameEN() {
		return moduleNameEN;
	}
	public void setModuleNameEN(String moduleNameEN) {
		this.moduleNameEN = moduleNameEN;
	}
	public String getModuleIcon() {
		return moduleIcon;
	}
	public void setModuleIcon(String moduleIcon) {
		this.moduleIcon = moduleIcon;
	}
	public String getModuleDescription() {
		return moduleDescription;
	}
	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
	}
	public List<FunctionDto> getFunctionList() {
		return functionList;
	}
	public void setFunctionList(List<FunctionDto> functionList) {
		this.functionList = functionList;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
