package com.hdw.erp.common.dto.org;

import java.util.ArrayList;
import java.util.List;

import com.hdw.erp.common.dto.ERPBaseDto;

public class DepartmentDto extends ERPBaseDto{
	private Long id;
	private String departmentCode;
	private String departmentAcronym;
	private Long departmentCategoryId;
	private String departmentDescription;
	private String departmentNameEN;
	private String departmentNameTH;
	private Long departmentParent;
	private Long organizationId;
	private String taxId;
	//for use chart
	private List<DepartmentDto> departmentDtoList = new ArrayList<DepartmentDto>();
	private OrganizationDto oranizationDto;
	private DepartmentDto departmentParentDto;
	private DepartmentCategoryDto departmentCatgoryDto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentAcronym() {
		return departmentAcronym;
	}
	public void setDepartmentAcronym(String departmentAcronym) {
		this.departmentAcronym = departmentAcronym;
	}
	public Long getDepartmentCategoryId() {
		return departmentCategoryId;
	}
	public void setDepartmentCategoryId(Long departmentCategoryId) {
		this.departmentCategoryId = departmentCategoryId;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	public String getDepartmentNameEN() {
		return departmentNameEN;
	}
	public void setDepartmentNameEN(String departmentNameEN) {
		this.departmentNameEN = departmentNameEN;
	}
	public String getDepartmentNameTH() {
		return departmentNameTH;
	}
	public void setDepartmentNameTH(String departmentNameTH) {
		this.departmentNameTH = departmentNameTH;
	}
	public Long getDepartmentParent() {
		return departmentParent;
	}
	public void setDepartmentParent(Long departmentParent) {
		this.departmentParent = departmentParent;
	}
	public Long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public List<DepartmentDto> getDepartmentDtoList() {
		return departmentDtoList;
	}
	public void setDepartmentDtoList(List<DepartmentDto> departmentDtoList) {
		this.departmentDtoList = departmentDtoList;
	}
	public OrganizationDto getOranizationDto() {
		return oranizationDto;
	}
	public void setOranizationDto(OrganizationDto oranizationDto) {
		this.oranizationDto = oranizationDto;
	}
	public DepartmentDto getDepartmentParentDto() {
		return departmentParentDto;
	}
	public void setDepartmentParentDto(DepartmentDto departmentParentDto) {
		this.departmentParentDto = departmentParentDto;
	}
	public DepartmentCategoryDto getDepartmentCatgoryDto() {
		return departmentCatgoryDto;
	}
	public void setDepartmentCatgoryDto(DepartmentCategoryDto departmentCatgoryDto) {
		this.departmentCatgoryDto = departmentCatgoryDto;
	}
}
