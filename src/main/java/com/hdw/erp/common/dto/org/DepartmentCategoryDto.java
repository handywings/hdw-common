package com.hdw.erp.common.dto.org;

import java.util.ArrayList;
import java.util.List;

import com.hdw.erp.common.dto.ERPBaseDto;

public class DepartmentCategoryDto extends ERPBaseDto{
	private Long id;
	private String departmentCategoryCode;
	private String departmentCategoryNameEN;
	private String departmentCategoryNameTH;
	private Long departmentCategoryParent;
	private String departmentCategoryParentName;
	private int level;
	private DepartmentCategoryDto departmentCategoryParentDto;
	private List<DepartmentCategoryDto> departmentCategoryDtoList = new ArrayList<DepartmentCategoryDto>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartmentCategoryCode() {
		return departmentCategoryCode;
	}
	public void setDepartmentCategoryCode(String departmentCategoryCode) {
		this.departmentCategoryCode = departmentCategoryCode;
	}
	public String getDepartmentCategoryNameEN() {
		return departmentCategoryNameEN;
	}
	public void setDepartmentCategoryNameEN(String departmentCategoryNameEN) {
		this.departmentCategoryNameEN = departmentCategoryNameEN;
	}
	public String getDepartmentCategoryNameTH() {
		return departmentCategoryNameTH;
	}
	public void setDepartmentCategoryNameTH(String departmentCategoryNameTH) {
		this.departmentCategoryNameTH = departmentCategoryNameTH;
	}
	public Long getDepartmentCategoryParent() {
		return departmentCategoryParent;
	}
	public void setDepartmentCategoryParent(Long departmentCategoryParent) {
		this.departmentCategoryParent = departmentCategoryParent;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getDepartmentCategoryParentName() {
		return departmentCategoryParentName;
	}
	public void setDepartmentCategoryParentName(String departmentCategoryParentName) {
		this.departmentCategoryParentName = departmentCategoryParentName;
	}
	public List<DepartmentCategoryDto> getDepartmentCategoryDtoList() {
		return departmentCategoryDtoList;
	}
	public void setDepartmentCategoryDtoList(List<DepartmentCategoryDto> departmentCategoryDtoList) {
		this.departmentCategoryDtoList = departmentCategoryDtoList;
	}
	public DepartmentCategoryDto getDepartmentCategoryParentDto() {
		return departmentCategoryParentDto;
	}
	public void setDepartmentCategoryParentDto(DepartmentCategoryDto departmentCategoryParentDto) {
		this.departmentCategoryParentDto = departmentCategoryParentDto;
	}
}
