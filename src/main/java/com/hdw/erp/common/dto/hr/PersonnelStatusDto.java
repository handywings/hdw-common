package com.hdw.erp.common.dto.hr;

import java.sql.Date;

import com.hdw.erp.common.dto.ERPBaseDto;

public class PersonnelStatusDto extends ERPBaseDto {
	private Long id;
	private Long personnelRecordId;
	// ========== กรณีชาวไทย
	// หมายเลขบัตร / เลขผู้เสียภาษี
	private String IDCard;
	// ออกให้โดย (เขต / อำเภอ)
	private String IDCardIssuedBy;
	// วันที่ออกบัตร
	private Date IDCardIssuedDate;
	// วันที่บัตรหมดอายุ
	private Date IDCardExpiryDate;

	// หมายเลขผู้เสียภาษี (ชาวต่างชาติ)
	private String taxNumber;
	// หมายเลข Visa
	private String visaNumber;
	// วันหมดอายุ Visa
	private Date visaExpiryDate;

	// เลขที่ Passport
	private String passportNumber;
	// วันที่ทำ Passport
	private Date passportIssuedDate;
	// วันหมดอายุ Passport
	private Date passportExpiryDate;

	// ========== ข้อมูลสมรส
	private String marryStatus;
	// สมรส ณ เขต / อำเภอ
	private String marriedAtDistrict;
	// สมรส ณ จังหวัด
	private String marriedAtProvince;
	// จดทะเบียนสมรสเมื่อ
	private Date marriageDate;

	// ========== ข้อมูลใบอนุญาตขับขี่
	// เลขที่ใบขับขี่
	private String driverLicenseID;
	// ประเภทใบขับขี่
	private String driverLicenseType;
	// วันที่บัตรหมดอายุ
	private Date driverLicenseExpiryDate;

	// ========== ข้อมูลสถานะภาพทางทหาร
	private String militaryStatus;

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}

	public String getIDCardIssuedBy() {
		return IDCardIssuedBy;
	}

	public void setIDCardIssuedBy(String iDCardIssuedBy) {
		IDCardIssuedBy = iDCardIssuedBy;
	}

	public Date getIDCardIssuedDate() {
		return IDCardIssuedDate;
	}

	public void setIDCardIssuedDate(Date iDCardIssuedDate) {
		IDCardIssuedDate = iDCardIssuedDate;
	}

	public Date getIDCardExpiryDate() {
		return IDCardExpiryDate;
	}

	public void setIDCardExpiryDate(Date iDCardExpiryDate) {
		IDCardExpiryDate = iDCardExpiryDate;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getVisaNumber() {
		return visaNumber;
	}

	public void setVisaNumber(String visaNumber) {
		this.visaNumber = visaNumber;
	}

	public Date getVisaExpiryDate() {
		return visaExpiryDate;
	}

	public void setVisaExpiryDate(Date visaExpiryDate) {
		this.visaExpiryDate = visaExpiryDate;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getPassportIssuedDate() {
		return passportIssuedDate;
	}

	public void setPassportIssuedDate(Date passportIssuedDate) {
		this.passportIssuedDate = passportIssuedDate;
	}

	public Date getPassportExpiryDate() {
		return passportExpiryDate;
	}

	public void setPassportExpiryDate(Date passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	public String getMarriedAtDistrict() {
		return marriedAtDistrict;
	}

	public void setMarriedAtDistrict(String marriedAtDistrict) {
		this.marriedAtDistrict = marriedAtDistrict;
	}

	public String getMarriedAtProvince() {
		return marriedAtProvince;
	}

	public void setMarriedAtProvince(String marriedAtProvince) {
		this.marriedAtProvince = marriedAtProvince;
	}

	public Date getMarriageDate() {
		return marriageDate;
	}

	public void setMarriageDate(Date marriageDate) {
		this.marriageDate = marriageDate;
	}

	public String getDriverLicenseID() {
		return driverLicenseID;
	}

	public void setDriverLicenseID(String driverLicenseID) {
		this.driverLicenseID = driverLicenseID;
	}

	public String getDriverLicenseType() {
		return driverLicenseType;
	}

	public void setDriverLicenseType(String driverLicenseType) {
		this.driverLicenseType = driverLicenseType;
	}

	public Date getDriverLicenseExpiryDate() {
		return driverLicenseExpiryDate;
	}

	public void setDriverLicenseExpiryDate(Date driverLicenseExpiryDate) {
		this.driverLicenseExpiryDate = driverLicenseExpiryDate;
	}

	public String getMarryStatus() {
		return marryStatus;
	}

	public void setMarryStatus(String marryStatus) {
		this.marryStatus = marryStatus;
	}

	public String getMilitaryStatus() {
		return militaryStatus;
	}

	public void setMilitaryStatus(String militaryStatus) {
		this.militaryStatus = militaryStatus;
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
