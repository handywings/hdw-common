package com.hdw.erp.common.dto.org;

import java.util.Date;

import com.hdw.erp.common.dto.ERPBaseDto;
import com.hdw.erp.common.dto.hr.AddressDto;
import com.hdw.erp.common.dto.hr.ContactDto;

public class OrganizationDto extends ERPBaseDto{
	private Long id;
	private double annualWelfareBalance;
	private Date astablishDate;
	private int dayExpireLogFile;
	private int dayProbation;
	private int hourPerDay;
	private String noTax;
	private String organizationAcronym;
	private String organizationCode;
	private String organizationNameEN;
	private String organizationNameTH;
	private Long organizationParent;
	private String taxId;
	private String imagePath;
	private Long addressId;
	private Long contactId;
	private AddressDto address;
	private ContactDto contact;
	private double capital;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getAnnualWelfareBalance() {
		return annualWelfareBalance;
	}
	public void setAnnualWelfareBalance(double annualWelfareBalance) {
		this.annualWelfareBalance = annualWelfareBalance;
	}
	public Date getAstablishDate() {
		return astablishDate;
	}
	public void setAstablishDate(Date astablishDate) {
		this.astablishDate = astablishDate;
	}
	public int getDayExpireLogFile() {
		return dayExpireLogFile;
	}
	public void setDayExpireLogFile(int dayExpireLogFile) {
		this.dayExpireLogFile = dayExpireLogFile;
	}
	public int getDayProbation() {
		return dayProbation;
	}
	public void setDayProbation(int dayProbation) {
		this.dayProbation = dayProbation;
	}
	public int getHourPerDay() {
		return hourPerDay;
	}
	public void setHourPerDay(int hourPerDay) {
		this.hourPerDay = hourPerDay;
	}
	public String getNoTax() {
		return noTax;
	}
	public void setNoTax(String noTax) {
		this.noTax = noTax;
	}
	public String getOrganizationAcronym() {
		return organizationAcronym;
	}
	public void setOrganizationAcronym(String organizationAcronym) {
		this.organizationAcronym = organizationAcronym;
	}
	public String getOrganizationCode() {
		return organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	public String getOrganizationNameEN() {
		return organizationNameEN;
	}
	public void setOrganizationNameEN(String organizationNameEN) {
		this.organizationNameEN = organizationNameEN;
	}
	public String getOrganizationNameTH() {
		return organizationNameTH;
	}
	public void setOrganizationNameTH(String organizationNameTH) {
		this.organizationNameTH = organizationNameTH;
	}
	public Long getOrganizationParent() {
		return organizationParent;
	}
	public void setOrganizationParent(Long organizationParent) {
		this.organizationParent = organizationParent;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}
	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
		this.address = address;
	}
	public ContactDto getContact() {
		return contact;
	}
	public void setContact(ContactDto contact) {
		this.contact = contact;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
}
