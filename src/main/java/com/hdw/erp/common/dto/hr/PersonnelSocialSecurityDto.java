package com.hdw.erp.common.dto.hr;

import java.sql.Date;

import com.hdw.erp.common.dto.ERPBaseDto;

public class PersonnelSocialSecurityDto extends ERPBaseDto {
	private Long id;
	// เลขที่บัตรประกันสังคม
	private String socialInsuranceNumber;
	// วันที่สมัคร
	private Date registerDate;
	// สถานพยาบาลที่ใช้สิทธิ์
	private String hospitalMain;
	// สถานพยาบาลสำรองอันดับ 1
	private String hospitalReserve1;
	// สถานพยาบาลสำรองอันดับ 2
	private String hospitalReserve2;
	// มีประกันสังคมมาก่อนหรือไม่ T / F
	private boolean hasSocialInsurance;
	// กรณีมีประกันสังคมมาก่อนแล้ว ให้ระบุชื่อสถานประกอบการเดิม
	private String organizationName;

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getHospitalMain() {
		return hospitalMain;
	}

	public void setHospitalMain(String hospitalMain) {
		this.hospitalMain = hospitalMain;
	}

	public String getHospitalReserve1() {
		return hospitalReserve1;
	}

	public void setHospitalReserve1(String hospitalReserve1) {
		this.hospitalReserve1 = hospitalReserve1;
	}

	public String getHospitalReserve2() {
		return hospitalReserve2;
	}

	public void setHospitalReserve2(String hospitalReserve2) {
		this.hospitalReserve2 = hospitalReserve2;
	}

	public boolean isHasSocialInsurance() {
		return hasSocialInsurance;
	}

	public void setHasSocialInsurance(boolean hasSocialInsurance) {
		this.hasSocialInsurance = hasSocialInsurance;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getSocialInsuranceNumber() {
		return socialInsuranceNumber;
	}

	public void setSocialInsuranceNumber(String socialInsuranceNumber) {
		this.socialInsuranceNumber = socialInsuranceNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
