package com.hdw.erp.common.dto.org;

import java.sql.Date;

import com.hdw.erp.common.dto.ERPBaseDto;

public class HolidayDto extends ERPBaseDto {
	private Long id;
	// ประเภทวันหยุด (วันหยุดประจำปี / วันหยุดพิเศษของบริษัท)
	private String holidayType;
	// หัวข้อวันหยุด
	private String holidayTopicTH;
	// หัวข้อวันหยุด
	private String holidayTopicEN;
	// รายละเอียด
	private String holidayDescription;
	// วันหยุด
	private Date holidayDateStart;
	private Date holidayDateEnd;
	
	// ปี
	private String year;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHolidayType() {
		return holidayType;
	}

	public void setHolidayType(String holidayType) {
		this.holidayType = holidayType;
	}

	public String getHolidayDescription() {
		return holidayDescription;
	}

	public void setHolidayDescription(String holidayDescription) {
		this.holidayDescription = holidayDescription;
	}

	public String getHolidayTopicTH() {
		return holidayTopicTH;
	}

	public void setHolidayTopicTH(String holidayTopicTH) {
		this.holidayTopicTH = holidayTopicTH;
	}

	public String getHolidayTopicEN() {
		return holidayTopicEN;
	}

	public void setHolidayTopicEN(String holidayTopicEN) {
		this.holidayTopicEN = holidayTopicEN;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Date getHolidayDateEnd() {
		return holidayDateEnd;
	}

	public void setHolidayDateEnd(Date holidayDateEnd) {
		this.holidayDateEnd = holidayDateEnd;
	}

	public Date getHolidayDateStart() {
		return holidayDateStart;
	}

	public void setHolidayDateStart(Date holidayDateStart) {
		this.holidayDateStart = holidayDateStart;
	}
}
