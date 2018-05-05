package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class ProfessionalSkillDto extends ERPBaseDto {
	private Long id;
	private Long personnelAptitudeId;
	// รหัสความเชี่ยวชาญ
	private int skillId;
	// จำนวนปีประสบการณ์การทำงาน
	private int yearsExperience;
	// ชื่อความเชี่ยวชาญ
	private String experienceTopic;
	// ชื่อความเชี่ยวชาญ
	private String experienceDetail;
	// ระดับความเชี่ยวชาญ
	private double experienceLevel;

	public int getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	public String getExperienceTopic() {
		return experienceTopic;
	}

	public void setExperienceTopic(String experienceTopic) {
		this.experienceTopic = experienceTopic;
	}

	public double getExperienceLevel() {
		return experienceLevel;
	}

	public String getExperienceDetail() {
		return experienceDetail;
	}

	public void setExperienceDetail(String experienceDetail) {
		this.experienceDetail = experienceDetail;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public void setExperienceLevel(double experienceLevel) {
		this.experienceLevel = experienceLevel;
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
