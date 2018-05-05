package com.hdw.erp.common.dto.hr;

import java.util.List;

import com.hdw.erp.common.dto.master.AmphurDto;
import com.hdw.erp.common.dto.master.DistrictDto;
import com.hdw.erp.common.dto.master.ProvinceDto;

public class AddressMasterDto {

	private List<ProvinceDto> provinceList;
	private List<AmphurDto> amphurList;
	private List<DistrictDto> districtList;
	private String zipCode;
	
	// select drop down
	private Long provinceId;
	private Long amphurId;
	private String districtCode;
	
	public List<ProvinceDto> getProvinceList() {
		return provinceList;
	}
	public void setProvinceList(List<ProvinceDto> provinceList) {
		this.provinceList = provinceList;
	}
	public List<AmphurDto> getAmphurList() {
		return amphurList;
	}
	public void setAmphurList(List<AmphurDto> amphurList) {
		this.amphurList = amphurList;
	}
	public List<DistrictDto> getDistrictList() {
		return districtList;
	}
	public void setDistrictList(List<DistrictDto> districtList) {
		this.districtList = districtList;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Long getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	public Long getAmphurId() {
		return amphurId;
	}
	public void setAmphurId(Long amphurId) {
		this.amphurId = amphurId;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
}
