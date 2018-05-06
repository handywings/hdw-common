package com.hdw.erp.common.dto.hr;

import java.sql.Date;
import java.util.List;

import com.hdw.erp.common.dto.ERPBaseDto;

public class CareerHistoryDto extends ERPBaseDto {
	private Long id;
	// ชื่อบริษัท
	private String company;
	// ที่อยู่บริษัท
	private AddressDto address;
	// ตำแหน่ง
	private String position;
	// ระดับพนักงาน
	private EmployeeLevelDto employeeLevel;
	// ระยะเวลาเริ่มทำงาน
	private Date workStart;
	// ระยะเวลาสิ้นสุดการทำงาน
	private Date workEnd;
	// เงินเดือน
	private double salary;
	// รายละเอียดการทำงาน
	private List<String> workDetail;
	
	//Added
	private Long personnelRecordId;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
		this.address = address;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public EmployeeLevelDto getEmployeeLevel() {
		return employeeLevel;
	}
	public void setEmployeeLevel(EmployeeLevelDto employeeLevel) {
		this.employeeLevel = employeeLevel;
	}
	public Date getWorkStart() {
		return workStart;
	}
	public void setWorkStart(Date workStart) {
		this.workStart = workStart;
	}
	public Date getWorkEnd() {
		return workEnd;
	}
	public void setWorkEnd(Date workEnd) {
		this.workEnd = workEnd;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<String> getWorkDetail() {
		return workDetail;
	}
	public void setWorkDetail(List<String> workDetail) {
		this.workDetail = workDetail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPersonnelRecordId() {
		return personnelRecordId;
	}
	public void setPersonnelRecordId(Long personnelRecordId) {
		this.personnelRecordId = personnelRecordId;
	}
}
