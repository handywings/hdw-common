package com.hdw.erp.common.dto.master;

public class ProvinceDto {

	private Long id;
	private String provinceName;
	private String provinceNameEng;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceNameEng() {
		return provinceNameEng;
	}
	public void setProvinceNameEng(String provinceNameEng) {
		this.provinceNameEng = provinceNameEng;
	}
}
