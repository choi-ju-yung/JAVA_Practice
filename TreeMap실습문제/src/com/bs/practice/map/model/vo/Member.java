package com.bs.practice.map.model.vo;

public class Member {
	private String password;
	private String name;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String password) {
		super();
		this.password = password;
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[password=" + password + ", name=" + name + "]";
	}
	
	
}
