package org.mytest.aop;

import java.util.Date;

public class MyTestBean {
	private String testStr = "testStr";

	private Date producDate;

	public Date getProducDate() {
		return producDate;
	}

	public void setProducDate(Date producDate) {
		this.producDate = producDate;
	}

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void  test(){
		System.out.println("test T_T");
	}

	@Override
	public String toString() {
		return this.testStr + "  " + producDate;
	}
}
