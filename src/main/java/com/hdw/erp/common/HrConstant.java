package com.hdw.erp.common;

public class HrConstant {
	public static final Long APPROVE_LIST = 3L ;
	
	//สถานะเอกสารใบลา
	//แบบร่าง
	public static final Long DRAFT = 1L;
	//รออนุมัติ
	public static final Long WAITING_APPROVE = 2L;
	//อนุมัติ
	public static final Long APPROVED = 3L;
	//ไม่อนุมัติ
	public static final Long NOT_ALLOWED = 4L;
	//ยกเลิก
	public static final Long CANCELED = 5L;
}
