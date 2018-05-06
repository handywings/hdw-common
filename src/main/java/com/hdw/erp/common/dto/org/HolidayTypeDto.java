package com.hdw.erp.common.dto.org;

import com.hdw.erp.common.dto.ERPBaseDto;

public class HolidayTypeDto extends ERPBaseDto {
	private Long id;
	private String HolidayTypeName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHolidayTypeName() {
		return HolidayTypeName;
	}
	public void setHolidayTypeName(String holidayTypeName) {
		HolidayTypeName = holidayTypeName;
	}
}
