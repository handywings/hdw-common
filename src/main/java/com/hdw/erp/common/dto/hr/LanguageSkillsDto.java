package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class LanguageSkillsDto extends ERPBaseDto {
	private Long id;
	private Long personnelAptitudeId;
	// ชื่อภาษา (ภาษาไทย)
	private String languageNameTH;
	// ชื่อภาษา (ภาษาอังกฤษ)
	private String languageNameEN;
	// ระดับทักษะการพูด
	private double speakingSkills;
	// ระดับทักษะการอ่าน
	private double readingSkills;
	// ระดับทักษะการเขียน
	private double writingSkills;
	// ระดับทักษะการฟัง
	private double listeningSkills;

	public String getLanguageNameTH() {
		return languageNameTH;
	}

	public void setLanguageNameTH(String languageNameTH) {
		this.languageNameTH = languageNameTH;
	}

	public String getLanguageNameEN() {
		return languageNameEN;
	}

	public void setLanguageNameEN(String languageNameEN) {
		this.languageNameEN = languageNameEN;
	}

	public double getSpeakingSkills() {
		return speakingSkills;
	}

	public void setSpeakingSkills(double speakingSkills) {
		this.speakingSkills = speakingSkills;
	}

	public double getReadingSkills() {
		return readingSkills;
	}

	public void setReadingSkills(double readingSkills) {
		this.readingSkills = readingSkills;
	}

	public double getWritingSkills() {
		return writingSkills;
	}

	public void setWritingSkills(double writingSkills) {
		this.writingSkills = writingSkills;
	}

	public double getListeningSkills() {
		return listeningSkills;
	}

	public void setListeningSkills(double listeningSkills) {
		this.listeningSkills = listeningSkills;
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
