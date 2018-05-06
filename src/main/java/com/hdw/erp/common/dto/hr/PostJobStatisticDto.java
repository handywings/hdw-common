package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class PostJobStatisticDto extends ERPBaseDto {
	// จำนวนผู้อ่าน
	private int viewTotal;

	public int getViewTotal() {
		return viewTotal;
	}

	public void setViewTotal(int viewTotal) {
		this.viewTotal = viewTotal;
	}
}
