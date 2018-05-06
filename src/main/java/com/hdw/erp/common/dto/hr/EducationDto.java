package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class EducationDto extends ERPBaseDto {
	private Long id;
	private Long personnelAptitudeId;
	// ระดับวุฒิการศึกษา
	private String educationLevel;
	// สถาบันการศึกษา
	private String educationalInstitution;
	// คณะ
	private String faculty;
	// สาขาวิชา
	private String branch;
	// ผลการศึกษา
	private double transcript;
	// ปีที่สำเร็จการศึกษา
	private String year;

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getEducationalInstitution() {
		return educationalInstitution;
	}

	public void setEducationalInstitution(String educationalInstitution) {
		this.educationalInstitution = educationalInstitution;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getTranscript() {
		return transcript;
	}

	public void setTranscript(double transcript) {
		this.transcript = transcript;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPersonnelAptitudeId() {
		return personnelAptitudeId;
	}

	public void setPersonnelAptitudeId(Long personnelAptitudeId) {
		this.personnelAptitudeId = personnelAptitudeId;
	}
}
