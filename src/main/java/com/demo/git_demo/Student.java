package com.demo.git_demo;

public class Student {
	private String name;
	private String rollNO;
	private int sid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNO() {
		return rollNO;
	}
	public void setRollNO(String rollNO) {
		this.rollNO = rollNO;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Student(String name, String rollNO, int sid) {
		super();
		this.name = name;
		this.rollNO = rollNO;
		this.sid = sid;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNO=" + rollNO + ", sid=" + sid + "]";
	}
	
	

}
