package com.hdw.erp.common.dto.org;

import com.hdw.erp.common.dto.ERPBaseDto;
import com.hdw.erp.common.dto.hr.EmployeeLevelDto;

public class PositionDto extends ERPBaseDto{
	
	private Long id;
	private String positionCode;
	private int dayProbation;
	private double startSalary;
	private double endSalary;
	private Long organizationId;
	private String positionDescription;
	private String positionNameEN;
	private String positionNameTH;
	private Long employeeLevelId;
	private EmployeeLevelDto employeeLevelDto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPositionCode() {
		return positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}
	public int getDayProbation() {
		return dayProbation;
	}
	public void setDayProbation(int dayProbation) {
		this.dayProbation = dayProbation;
	}
	public double getStartSalary() {
		return startSalary;
	}
	public void setStartSalary(double startSalary) {
		this.startSalary = startSalary;
	}
	public double getEndSalary() {
		return endSalary;
	}
	public void setEndSalary(double endSalary) {
		this.endSalary = endSalary;
	}
	public Long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}
	public String getPositionDescription() {
		return positionDescription;
	}
	public void setPositionDescription(String positionDescription) {
		this.positionDescription = positionDescription;
	}
	public String getPositionNameEN() {
		return positionNameEN;
	}
	public void setPositionNameEN(String positionNameEN) {
		this.positionNameEN = positionNameEN;
	}
	public String getPositionNameTH() {
		return positionNameTH;
	}
	public void setPositionNameTH(String positionNameTH) {
		this.positionNameTH = positionNameTH;
	}
	public Long getEmployeeLevelId() {
		return employeeLevelId;
	}
	public void setEmployeeLevelId(Long employeeLevelId) {
		this.employeeLevelId = employeeLevelId;
	}
	public EmployeeLevelDto getEmployeeLevelDto() {
		return employeeLevelDto;
	}
	public void setEmployeeLevelDto(EmployeeLevelDto employeeLevelDto) {
		this.employeeLevelDto = employeeLevelDto;
	}
}
