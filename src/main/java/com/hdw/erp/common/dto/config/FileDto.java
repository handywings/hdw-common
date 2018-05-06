package com.hdw.erp.common.dto.config;

import com.hdw.erp.common.dto.ERPBaseDto;

public class FileDto extends ERPBaseDto {
	// รหัสไฟล์
	private Long id;
	// ชื่อไฟล์
	private String fileName;
	// คำอธิบายไฟล์
	private String fileDescription;
	// ประเภทของไฟล์ (รูปภาพ, เอกสาร, ไฟล์ Backup)
	private FileTypeDto fileType;
	// ไฟล์อ้างอิงจากโมดูล
	private ModuleDto module;
	// ไฟล์อ้างอิงจากระบบอะไร
	private SystemDto system;
	// พาธไฟล์
	private String filePath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileDescription() {
		return fileDescription;
	}

	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}

	public FileTypeDto getFileType() {
		return fileType;
	}

	public void setFileType(FileTypeDto fileType) {
		this.fileType = fileType;
	}

	public ModuleDto getModule() {
		return module;
	}

	public void setModule(ModuleDto module) {
		this.module = module;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public SystemDto getSystem() {
		return system;
	}

	public void setSystem(SystemDto system) {
		this.system = system;
	}
}
