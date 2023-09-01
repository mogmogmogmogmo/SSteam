package com.ss.demo.domain;

public class Criteria {
	
	private int page;
	
	private int perPageNum;
	
	private int sNum;
	
	public Criteria() {
		this.page = 1;
		this.perPageNum =10;
		this.sNum = (page-1)*perPageNum;
	}
	
	public int getsNum() {
		this.sNum = (this.page-1)*this.perPageNum;
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

		
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

}
