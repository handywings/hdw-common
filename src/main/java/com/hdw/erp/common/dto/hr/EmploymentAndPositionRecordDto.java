package com.hdw.erp.common.dto.hr;

import java.sql.Date;

import com.hdw.erp.common.dto.ERPBaseDto;
import com.hdw.erp.common.dto.org.DepartmentDto;
import com.hdw.erp.common.dto.org.PositionDto;

public class EmploymentAndPositionRecordDto extends ERPBaseDto {
	private Long id;
	// ตำแหน่ง
	private PositionDto position;
	// สังกัดหน่วยงาน
	private DepartmentDto department;
	// ฐานเงินเดือน
	private double baseSalary;
	// วันที่บันทึกเลื่อนตำแหน่ง ย้ายหน่วยงาน หรือปรับเพิ่มเงินเดือน
	private Date salaryUpdateDate;
	// บันทึกเพิ่มเติม
	private String note;
	// อ้างอิงใบสัญญาว่าจ้าง
	private PersonnelEmploymentDto personnelEmployment;
	
	public PositionDto getPosition() {
		return position;
	}
	public void setPosition(PositionDto position) {
		this.position = position;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Date getSalaryUpdateDate() {
		return salaryUpdateDate;
	}
	public void setSalaryUpdateDate(Date salaryUpdateDate) {
		this.salaryUpdateDate = salaryUpdateDate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public PersonnelEmploymentDto getPersonnelEmployment() {
		return personnelEmployment;
	}
	public void setPersonnelEmployment(PersonnelEmploymentDto personnelEmployment) {
		this.personnelEmployment = personnelEmployment;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
