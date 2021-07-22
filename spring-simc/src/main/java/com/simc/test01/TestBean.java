package com.simc.test01;


public class TestBean {

	private String userName;

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void aaa(){
		System.out.println("nihao..."+this.userName);
	}
}
