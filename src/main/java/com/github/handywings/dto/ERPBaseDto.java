package com.github.handywings.dto;

import java.util.Date;

import com.github.handywings.dto.config.StatusDto;

public class ERPBaseDto {
	private Long recorder;
	private Date createDate;
	private Long editor;
	private Date lastUpdate;
	private String recorderType;
	private String editorType;
	private String activeFlag;
	private StatusDto statusDto;
	
	public Long getRecorder() {
		return recorder;
	}
	public void setRecorder(Long recorder) {
		this.recorder = recorder;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Long getEditor() {
		return editor;
	}
	public void setEditor(Long editor) {
		this.editor = editor;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getRecorderType() {
		return recorderType;
	}
	public void setRecorderType(String recorderType) {
		this.recorderType = recorderType;
	}
	public String getEditorType() {
		return editorType;
	}
	public void setEditorType(String editorType) {
		this.editorType = editorType;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public StatusDto getStatusDto() {
		return statusDto;
	}
	public void setStatusDto(StatusDto statusDto) {
		this.statusDto = statusDto;
	}
	
}
