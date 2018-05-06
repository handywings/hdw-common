package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.ERPBaseDto;

public class PostJobStatisticDto extends ERPBaseDto {
	private Long id;
	private Long postJobId;
	// จำนวนผู้อ่าน
	private int viewTotal;

	public int getViewTotal() {
		return viewTotal;
	}

	public void setViewTotal(int viewTotal) {
		this.viewTotal = viewTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPostJobId() {
		return postJobId;
	}

	public void setPostJobId(Long postJobId) {
		this.postJobId = postJobId;
	}
}
