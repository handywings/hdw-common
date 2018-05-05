package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class AddressDto extends ERPBaseDto{
	
	private Long id;
	private String no;
	private String section;
	private String building;
	private String room;
	private String floor;
	private String village;
	private String alley;
	private String road;
	private Long district;
	private Long amphur;
	private Long province;
	private Long postcode;
	private String country;
	private String latitude;
	private String longitude;
	private String addressType;
	private String districtOther;
	private String provinceOther;
	private String countryOther;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getAlley() {
		return alley;
	}
	public void setAlley(String alley) {
		this.alley = alley;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public Long getDistrict() {
		return district;
	}
	public void setDistrict(Long district) {
		this.district = district;
	}
	public Long getAmphur() {
		return amphur;
	}
	public void setAmphur(Long amphur) {
		this.amphur = amphur;
	}
	public Long getProvince() {
		return province;
	}
	public void setProvince(Long province) {
		this.province = province;
	}
	public Long getPostcode() {
		return postcode;
	}
	public void setPostcode(Long postcode) {
		this.postcode = postcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getDistrictOther() {
		return districtOther;
	}
	public void setDistrictOther(String districtOther) {
		this.districtOther = districtOther;
	}
	public String getProvinceOther() {
		return provinceOther;
	}
	public void setProvinceOther(String provinceOther) {
		this.provinceOther = provinceOther;
	}
	public String getCountryOther() {
		return countryOther;
	}
	public void setCountryOther(String countryOther) {
		this.countryOther = countryOther;
	}
	
}
