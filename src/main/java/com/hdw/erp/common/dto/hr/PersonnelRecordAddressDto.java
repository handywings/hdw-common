package com.hdw.erp.common.dto.hr;

import com.hdw.erp.common.dto.config.DocumentDto;

public class PersonnelRecordAddressDto extends DocumentDto {

	private Long id;
	private AddressDto Address;
	private PersonRecordDto personRecord;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public AddressDto getAddress() {
		return Address;
	}
	public void setAddress(AddressDto address) {
		Address = address;
	}
	public PersonRecordDto getPersonRecord() {
		return personRecord;
	}
	public void setPersonRecord(PersonRecordDto personRecord) {
		this.personRecord = personRecord;
	}
}
