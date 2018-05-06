package com.hdw.erp.common.dto.hr;

import java.sql.Date;
import java.util.List;

import com.hdw.erp.common.dto.config.DocumentDto;
import com.hdw.erp.common.dto.org.DepartmentDto;
import com.hdw.erp.common.dto.org.PositionDto;
import com.hdw.erp.common.dto.org.ShiftWorkDto;

public class PersonnelEmploymentDto extends DocumentDto {
	private Long id;
	// พนักงาน
	private PersonnelDto personnel;
	// ตำแหน่งหลักปัจจุบัน
	private PositionDto position;
	// สังกัดหน่วยงานปัจจุบัน
	private DepartmentDto department;
	// หัวหน้างาน (กรณีพิเศษ)
	private PersonnelDto commander;
	// รูปแบบสัญญาจ้าง (สัญญาจ้างพนักงานประจำ / สัญญาจ้างพนักงานชั่วคราว)
	private String contractForm;
	// ประเภทพนักงาน (ยกตัวอย่าง พนักงานรายเดือน, พนักงานรายวัน, พนักงานจ้างเหมา,
	// พนักงานรายชั่วโมง)
	private PersonnelTypeDto personnelType;
	// วันที่เริ่มต้นสัญญา
	private Date contractDateStart;
	// ฐานเงินเดือนปัจจุบัน
	private double baseSalary;
	// วันที่สิ้นสุดสัญญา
	private Date contractDateEnd;
	// กะการทำงาน
	private ShiftWorkDto shiftWork;
	// สิทธิ์กลุ่มลา
	private LeaveGroupDto leaveGroup;
	// วันลาคงเหลือ
	private List<LeaveBalanceDto> leaveBalance;
	// วันที่บรรจุเป็นพนักงาน
	private Date dateAddedPersonnel;
	// ประวัติการเลื่อนตำแหน่ง ย้ายสาขา และปรับฐานเงินเดือน
	private List<EmploymentAndPositionRecordDto> employmentAndPositionList;
	// สถานะการทำงาน (ปกติ, พักงานชั่วคราว, ลาออก, เชิญออก, ไล่ออก)
	private String workStatus;
	// สถานะการฝึกงาน (ไม่ต้องทดลองงาน, ผ่านการทดลองงานแล้ว, ยังไม่ผ่านการทดลองงาน,
	// กำลังทดลองงาน)
	private String statusOfInternships;
	// ข้อมูลการทดลองงาน
	private InternshipsDto internships;
	// วันที่หมดสภาพพนักงาน
	private Date resignDate;
	// ยกเลิกสัญญาหรือไม่
	private boolean isEnable;
	// หมายเหตุ / บันทึกเพิ่มเติม
	private String note;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PersonnelDto getPersonnel() {
		return personnel;
	}
	public void setPersonnel(PersonnelDto personnel) {
		this.personnel = personnel;
	}
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
	public PersonnelDto getCommander() {
		return commander;
	}
	public void setCommander(PersonnelDto commander) {
		this.commander = commander;
	}
	public String getContractForm() {
		return contractForm;
	}
	public void setContractForm(String contractForm) {
		this.contractForm = contractForm;
	}
	public PersonnelTypeDto getPersonnelType() {
		return personnelType;
	}
	public void setPersonnelType(PersonnelTypeDto personnelType) {
		this.personnelType = personnelType;
	}
	public Date getContractDateStart() {
		return contractDateStart;
	}
	public void setContractDateStart(Date contractDateStart) {
		this.contractDateStart = contractDateStart;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Date getContractDateEnd() {
		return contractDateEnd;
	}
	public void setContractDateEnd(Date contractDateEnd) {
		this.contractDateEnd = contractDateEnd;
	}
	public ShiftWorkDto getShiftWork() {
		return shiftWork;
	}
	public void setShiftWork(ShiftWorkDto shiftWork) {
		this.shiftWork = shiftWork;
	}
	public LeaveGroupDto getLeaveGroup() {
		return leaveGroup;
	}
	public void setLeaveGroup(LeaveGroupDto leaveGroup) {
		this.leaveGroup = leaveGroup;
	}
	public List<LeaveBalanceDto> getLeaveBalance() {
		return leaveBalance;
	}
	public void setLeaveBalance(List<LeaveBalanceDto> leaveBalance) {
		this.leaveBalance = leaveBalance;
	}
	public Date getDateAddedPersonnel() {
		return dateAddedPersonnel;
	}
	public void setDateAddedPersonnel(Date dateAddedPersonnel) {
		this.dateAddedPersonnel = dateAddedPersonnel;
	}
	public List<EmploymentAndPositionRecordDto> getEmploymentAndPositionList() {
		return employmentAndPositionList;
	}
	public void setEmploymentAndPositionList(List<EmploymentAndPositionRecordDto> employmentAndPositionList) {
		this.employmentAndPositionList = employmentAndPositionList;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	public String getStatusOfInternships() {
		return statusOfInternships;
	}
	public void setStatusOfInternships(String statusOfInternships) {
		this.statusOfInternships = statusOfInternships;
	}
	public InternshipsDto getInternships() {
		return internships;
	}
	public void setInternships(InternshipsDto internships) {
		this.internships = internships;
	}
	public Date getResignDate() {
		return resignDate;
	}
	public void setResignDate(Date resignDate) {
		this.resignDate = resignDate;
	}
	public boolean isEnable() {
		return isEnable;
	}
	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
