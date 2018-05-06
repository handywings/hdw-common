package com.hdw.erp.common.dto.hr;

import java.sql.Date;
import java.util.List;

import com.hdw.erp.common.dto.ERPBaseDto;

public class PersonRecordDto extends ERPBaseDto {
	private Long id;
	// รูป
	private String picture;
	// คำนำหน้า
	private String initials;
	// ชื่อ (ภาษาไทย)
	private String firstNameTH;
	// นามสกุล (ภาษาไทย)
	private String lastNameTH;
	// ชื่อเล่น (ภาษาไทย)
	private String nicknameTH;
	// ชื่อ (ภาษาอังกฤษ)
	private String firstNameEN;
	// นามสกุล (ภาษาอังกฤษ)
	private String lastNameEN;
	// ชื่อเล่น (ภาษาอังกฤษ)
	private String nicknameEN;
	// วันเกิด
	private Date birthday;
	// เพศ
	private String gender;
	// ส่วนสูง
	private double height;
	// น้ำหนัก
	private double weight;
	// หมู่เลือด
	private String bloodType;
	// สัญชาติ
	private String nationality;
	// เชื้อชาติ
	private String race;
	// ศาสนา
	private String religion;
	// ประเทศที่เกิด
	private String homeCountry;
	// จังหวัดที่เกิด
	private String province;

	// ข้อมูลสถานะภาพส่วนตัว (Personnel Status)
	private PersonnelStatusDto personnelStatus;
	// ข้อมูลความรู้ความสามารถ (Personnel Aptitude)
	private PersonnelAptitudeDto personnelAptitude;
	// ข้อมูลการอบรม (Personnel Training)
	private List<PersonnelTrainingDto> personnelTrainingList;
	// ข้อมูลใบรับรอง (Certification)
	private List<CertificationDto> certificationList;
	// ข้อมูลที่อยู่ (Address)
	private List<AddressDto> addressList;
	// ข้อมูลติดต่อ (Contact)
	private ContactDto contact;
	// ประวัติการทำงาน
	private List<CareerHistoryDto> careerHistory;

	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public String getFirstNameTH() {
		return firstNameTH;
	}
	public void setFirstNameTH(String firstNameTH) {
		this.firstNameTH = firstNameTH;
	}
	public String getLastNameTH() {
		return lastNameTH;
	}
	public void setLastNameTH(String lastNameTH) {
		this.lastNameTH = lastNameTH;
	}
	public String getNicknameTH() {
		return nicknameTH;
	}
	public void setNicknameTH(String nicknameTH) {
		this.nicknameTH = nicknameTH;
	}
	public String getFirstNameEN() {
		return firstNameEN;
	}
	public void setFirstNameEN(String firstNameEN) {
		this.firstNameEN = firstNameEN;
	}
	public String getLastNameEN() {
		return lastNameEN;
	}
	public void setLastNameEN(String lastNameEN) {
		this.lastNameEN = lastNameEN;
	}
	public String getNicknameEN() {
		return nicknameEN;
	}
	public void setNicknameEN(String nicknameEN) {
		this.nicknameEN = nicknameEN;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getHomeCountry() {
		return homeCountry;
	}
	public void setHomeCountry(String homeCountry) {
		this.homeCountry = homeCountry;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public PersonnelStatusDto getPersonnelStatus() {
		return personnelStatus;
	}
	public void setPersonnelStatus(PersonnelStatusDto personnelStatus) {
		this.personnelStatus = personnelStatus;
	}
	public PersonnelAptitudeDto getPersonnelAptitude() {
		return personnelAptitude;
	}
	public void setPersonnelAptitude(PersonnelAptitudeDto personnelAptitude) {
		this.personnelAptitude = personnelAptitude;
	}
	public List<PersonnelTrainingDto> getPersonnelTrainingList() {
		return personnelTrainingList;
	}
	public void setPersonnelTrainingList(List<PersonnelTrainingDto> personnelTrainingList) {
		this.personnelTrainingList = personnelTrainingList;
	}
	public List<CertificationDto> getCertificationList() {
		return certificationList;
	}
	public void setCertificationList(List<CertificationDto> certificationList) {
		this.certificationList = certificationList;
	}
	public List<AddressDto> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<AddressDto> addressList) {
		this.addressList = addressList;
	}
	public ContactDto getContact() {
		return contact;
	}
	public void setContact(ContactDto contact) {
		this.contact = contact;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<CareerHistoryDto> getCareerHistory() {
		return careerHistory;
	}
	public void setCareerHistory(List<CareerHistoryDto> careerHistory) {
		this.careerHistory = careerHistory;
	}
}
