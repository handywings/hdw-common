package com.hdw.erp.common.dto.hr;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hdw.erp.common.ApplicationConstant;
import com.hdw.erp.common.dto.ERPBaseDto;
import com.hdw.erp.common.dto.config.FileDto;

public class PersonnelTrainingDto extends ERPBaseDto {
	// รหัสโครงการอบรม
	private Long id;
	// เลขที่โครงการอบรม
	private String trainingNumber;
	// ชื่อสถาบัน / องค์กร / บริษัท
	private String trainingInstitute;
	// สถานที่อบรม
	private AddressDto address;
	// ชื่อหลักสูตรอบรม / สัมนา (ภาษาไทย)
	private String trainingCoursesTH;
	// ชื่อหลักสูตรอบรม / สัมนา (ภาษาอังกฤษ)
	private String trainingCoursesEN;
	// ลักษณะงาน หรือ เนื้อหาที่อบรม / สัมนา
	private String description;
	// ได้รับวุฒิบัตรหรือไม่ T / F
	private boolean hasCertificate;
	// ช่วงวันเวลาเริ่มต้น
	@JsonFormat(pattern = ApplicationConstant.DATE_FORMAT1 , timezone = ApplicationConstant.ERP_TIMEZONE)
	private Timestamp trainingDateStart;
	// ช่วงวันเวลาสิ้นสุด
	@JsonFormat(pattern = ApplicationConstant.DATE_FORMAT1, timezone = ApplicationConstant.ERP_TIMEZONE)
	private Timestamp trainingDateEnd;
	// คำอธิบายเพิ่มเติม
	private String note;
	// ไฟล์แนป
	private FileDto file;
	
	//Added
	private Long personnelRecordId;
	
	
	public String getTrainingNumber() {
		return trainingNumber;
	}
	public void setTrainingNumber(String trainingNumber) {
		this.trainingNumber = trainingNumber;
	}
	public String getTrainingInstitute() {
		return trainingInstitute;
	}
	public void setTrainingInstitute(String trainingInstitute) {
		this.trainingInstitute = trainingInstitute;
	}
	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
		this.address = address;
	}
	public String getTrainingCoursesTH() {
		return trainingCoursesTH;
	}
	public void setTrainingCoursesTH(String trainingCoursesTH) {
		this.trainingCoursesTH = trainingCoursesTH;
	}
	public String getTrainingCoursesEN() {
		return trainingCoursesEN;
	}
	public void setTrainingCoursesEN(String trainingCoursesEN) {
		this.trainingCoursesEN = trainingCoursesEN;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isHasCertificate() {
		return hasCertificate;
	}
	public void setHasCertificate(boolean hasCertificate) {
		this.hasCertificate = hasCertificate;
	}
	public Timestamp getTrainingDateStart() {
		return trainingDateStart;
	}
	public void setTrainingDateStart(Timestamp trainingDateStart) {
		this.trainingDateStart = trainingDateStart;
	}
	public Timestamp getTrainingDateEnd() {
		return trainingDateEnd;
	}
	public void setTrainingDateEnd(Timestamp trainingDateEnd) {
		this.trainingDateEnd = trainingDateEnd;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public FileDto getFile() {
		return file;
	}
	public void setFile(FileDto file) {
		this.file = file;
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
