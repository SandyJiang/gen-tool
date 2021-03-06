package com.daydaycook.ddc.core.soa;

import com.daydaycook.ddc.core.exception.BusinessException;

public class SOAException extends BusinessException {
	private static final long serialVersionUID = 5324959190479669618L;
	private static int ERROR_CODE = -11;
	static {

	}

	public SOAException(String message, Throwable t){
		super(message, t);
		setCode(ERROR_CODE);
	}
}
