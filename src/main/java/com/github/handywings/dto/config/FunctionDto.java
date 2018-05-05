package com.github.handywings.dto.config;

import com.github.handywings.dto.ERPBaseDto;

public class FunctionDto extends ERPBaseDto {
	// รหัสโมดูล
	private int functionId;
	// ชื่อโมดูล (ภาษาไทย)
	private String functionNameTH;
	// ชื่อโมดูล (ภาษาอังกฤษ)
	private String functionNameEN;
	// คำอธิบายโมดูล
	private String functionDescription;
	// รูปแบบการทำงาน (Create - Read - Update - Delete)
	private String actionType;

	public int getFunctionId() {
		return functionId;
	}

	public void setFunctionId(int functionId) {
		this.functionId = functionId;
	}

	public String getFunctionNameTH() {
		return functionNameTH;
	}

	public void setFunctionNameTH(String functionNameTH) {
		this.functionNameTH = functionNameTH;
	}

	public String getFunctionNameEN() {
		return functionNameEN;
	}

	public void setFunctionNameEN(String functionNameEN) {
		this.functionNameEN = functionNameEN;
	}

	public String getFunctionDescription() {
		return functionDescription;
	}

	public void setFunctionDescription(String functionDescription) {
		this.functionDescription = functionDescription;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
}
