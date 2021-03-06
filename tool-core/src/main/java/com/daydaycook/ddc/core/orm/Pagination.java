package com.daydaycook.ddc.core.orm;

import java.io.Serializable;

public class Pagination implements Serializable {
	private static final long serialVersionUID = 2826397969274951545L;
	private int pageNo = 1;
	private int pageSize = 20;
	private int limitStart = 0;
	private String orderBy;

	public int getLimitStart() {
		return limitStart;
	}

	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
}
