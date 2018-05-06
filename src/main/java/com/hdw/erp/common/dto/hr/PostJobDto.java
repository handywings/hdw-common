package com.hdw.erp.common.dto.hr;

import java.sql.Date;
import java.util.List;
import java.util.Vector;

import com.hdw.erp.common.dto.config.DocumentDto;
import com.hdw.erp.common.dto.config.FileDto;
import com.hdw.erp.common.dto.crm.SearchEngineOptimizationDto;
import com.hdw.erp.common.dto.org.OrganizationDto;
import com.hdw.erp.common.dto.org.PositionDto;

public class PostJobDto extends DocumentDto {
	// รหัสตำแหน่งงาน
	private long postJobId;
	// หมายเลขตำแหน่งงาน
	private String postJobNumber;
	// รูปภาพหลัก
	private String postJobImage;
	// ชื่อหัวข้อประกาศ (ภาษาไทย)
	private String postJobTopicTH;
	// ชื่อหัวข้อประกาศ (ภาษาอังกฤษ)
	private String postJobTopicEN;
	// ตำแหน่งที่เปิดรับสมัคร
	private PositionDto position;
	// รายการบริษัทที่เปิดรับ
	private List<OrganizationDto> organizationList;
	// อัตราตำแหน่ง
	private int numberPosition;
	// เงินเดือนเริ่มต้น
	private double salaryStart;
	// เงินเดือนขั้นสุด
	private double salaryLimit;
	// คุณสมบัติผู้สมัคร (ภาษาไทย)
	private String jobPropertyTH;
	// คุณสมบัติผู้สมัคร (ภาษาอังกฤษ)
	private String jobPropertyEN;
	// สวัสดิการ (ภาษาไทย)
	private String jobBenefitsTH;
	// สวัสดิการ (ภาษาอังกฤษ)
	private String jobBenefitsEN;
	// รายละเอียดประกาศ (ภาษาไทย)
	private String detail_TH;
	// รายละเอียดประกาศ (ภาษาอังกฤษ)
	private String detail_EN;
	// รายการรูปภาพประชาสัมพันธ์
	private Vector<FileDto> imageList;
	// รายการไฟล์เอกสารอ้างอิง
	private Vector<FileDto> documentList;
	// วันเริ่มต้นเปิดการรับสมัคร
	private Date publishStartDate;
	// สถานะการประกาศเผยแพร่ใน Facebook
	private boolean isPublishOnFacebook;
	// SEO
	private SearchEngineOptimizationDto seo;
	// สถิติเกี่ยวกับประกาศข่าวที่สำคัญ
	private PostJobStatisticDto statistic;
	
	public long getPostJobId() {
		return postJobId;
	}
	public void setPostJobId(long postJobId) {
		this.postJobId = postJobId;
	}
	public String getPostJobNumber() {
		return postJobNumber;
	}
	public void setPostJobNumber(String postJobNumber) {
		this.postJobNumber = postJobNumber;
	}
	public String getPostJobImage() {
		return postJobImage;
	}
	public void setPostJobImage(String postJobImage) {
		this.postJobImage = postJobImage;
	}
	public String getPostJobTopicTH() {
		return postJobTopicTH;
	}
	public void setPostJobTopicTH(String postJobTopicTH) {
		this.postJobTopicTH = postJobTopicTH;
	}
	public String getPostJobTopicEN() {
		return postJobTopicEN;
	}
	public void setPostJobTopicEN(String postJobTopicEN) {
		this.postJobTopicEN = postJobTopicEN;
	}
	public PositionDto getPosition() {
		return position;
	}
	public void setPosition(PositionDto position) {
		this.position = position;
	}
	public List<OrganizationDto> getOrganizationList() {
		return organizationList;
	}
	public void setOrganizationList(List<OrganizationDto> organizationList) {
		this.organizationList = organizationList;
	}
	public int getNumberPosition() {
		return numberPosition;
	}
	public void setNumberPosition(int numberPosition) {
		this.numberPosition = numberPosition;
	}
	public double getSalaryStart() {
		return salaryStart;
	}
	public void setSalaryStart(double salaryStart) {
		this.salaryStart = salaryStart;
	}
	public double getSalaryLimit() {
		return salaryLimit;
	}
	public void setSalaryLimit(double salaryLimit) {
		this.salaryLimit = salaryLimit;
	}
	public String getJobPropertyTH() {
		return jobPropertyTH;
	}
	public void setJobPropertyTH(String jobPropertyTH) {
		this.jobPropertyTH = jobPropertyTH;
	}
	public String getJobPropertyEN() {
		return jobPropertyEN;
	}
	public void setJobPropertyEN(String jobPropertyEN) {
		this.jobPropertyEN = jobPropertyEN;
	}
	public String getJobBenefitsTH() {
		return jobBenefitsTH;
	}
	public void setJobBenefitsTH(String jobBenefitsTH) {
		this.jobBenefitsTH = jobBenefitsTH;
	}
	public String getJobBenefitsEN() {
		return jobBenefitsEN;
	}
	public void setJobBenefitsEN(String jobBenefitsEN) {
		this.jobBenefitsEN = jobBenefitsEN;
	}
	public String getDetail_TH() {
		return detail_TH;
	}
	public void setDetail_TH(String detail_TH) {
		this.detail_TH = detail_TH;
	}
	public String getDetail_EN() {
		return detail_EN;
	}
	public void setDetail_EN(String detail_EN) {
		this.detail_EN = detail_EN;
	}
	public Vector<FileDto> getImageList() {
		return imageList;
	}
	public void setImageList(Vector<FileDto> imageList) {
		this.imageList = imageList;
	}
	public Vector<FileDto> getDocumentList() {
		return documentList;
	}
	public void setDocumentList(Vector<FileDto> documentList) {
		this.documentList = documentList;
	}
	public Date getPublishStartDate() {
		return publishStartDate;
	}
	public void setPublishStartDate(Date publishStartDate) {
		this.publishStartDate = publishStartDate;
	}
	public boolean isPublishOnFacebook() {
		return isPublishOnFacebook;
	}
	public void setPublishOnFacebook(boolean isPublishOnFacebook) {
		this.isPublishOnFacebook = isPublishOnFacebook;
	}
	public SearchEngineOptimizationDto getSeo() {
		return seo;
	}
	public void setSeo(SearchEngineOptimizationDto seo) {
		this.seo = seo;
	}
	public PostJobStatisticDto getStatistic() {
		return statistic;
	}
	public void setStatistic(PostJobStatisticDto statistic) {
		this.statistic = statistic;
	}
}
