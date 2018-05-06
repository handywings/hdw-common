package com.hdw.erp.common.dto.hr;

import java.sql.Date;

import com.hdw.erp.common.dto.ERPBaseDto;

public class InternshipsDto extends ERPBaseDto {
	private Long id;
	// วันที่เริ่มทดลองงาน
	private Date internshipsDateStart;
	// วันที่สิ้นสุดทดลองงาน
	private Date internshipsDateEnd;

	public Date getInternshipsDateStart() {
		return internshipsDateStart;
	}

	public void setInternshipsDateStart(Date internshipsDateStart) {
		this.internshipsDateStart = internshipsDateStart;
	}

	public Date getInternshipsDateEnd() {
		return internshipsDateEnd;
	}

	public void setInternshipsDateEnd(Date internshipsDateEnd) {
		this.internshipsDateEnd = internshipsDateEnd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
