package com.hdw.erp.common.dto.hr;

import java.util.List;

import com.hdw.erp.common.dto.ERPBaseDto;

public class PersonnelAptitudeDto extends ERPBaseDto {
	private Long id;
	private Long personnelRecordId;
	// รายการประวัติการศึกษา
	private List<EducationDto> educationList;
	// รายการความสามารถด้านภาษา
	private List<LanguageSkillsDto> languageSkillsList;
	// รายการความสามารถทางวิชาชีพ / ทั่วไป
	private List<ProfessionalSkillDto> professionalSkillsList;
	
	public List<EducationDto> getEducationList() {
		return educationList;
	}
	public void setEducationList(List<EducationDto> educationList) {
		this.educationList = educationList;
	}
	public List<LanguageSkillsDto> getLanguageSkillsList() {
		return languageSkillsList;
	}
	public void setLanguageSkillsList(List<LanguageSkillsDto> languageSkillsList) {
		this.languageSkillsList = languageSkillsList;
	}
	public List<ProfessionalSkillDto> getProfessionalSkillsList() {
		return professionalSkillsList;
	}
	public void setProfessionalSkillsList(List<ProfessionalSkillDto> professionalSkillsList) {
		this.professionalSkillsList = professionalSkillsList;
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
