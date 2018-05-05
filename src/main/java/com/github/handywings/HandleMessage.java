package com.github.handywings;

public class HandleMessage {
	public ErpResponse processSuccess(ErpResponse erpResponse){
		erpResponse.setStatusCode(ApplicationConstant.SUCCESS_CODE);	
		erpResponse.setMessage(ApplicationConstant.SUCCESS_MESSAGE);
		return erpResponse;
	}
	
	public ErpResponse processError(ErpResponse erpResponse){
		erpResponse.setStatusCode(ApplicationConstant.ERROR_CODE);	
		if(!ApplicationConstant.EMPTY.equals(erpResponse.getMessage()) || erpResponse.getMessage() != null){
			erpResponse.setMessage(erpResponse.getMessage());
		}else{
			erpResponse.setMessage(ApplicationConstant.ERROR_MESSAGE);
		}
		return erpResponse;
	}
}
