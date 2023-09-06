package com.tech.blog.entity;

public class Category {
	private int cid;
	private String name;
	private String descreption;

	public Category(int cid, String name, String descreption) {
		this.cid = cid;
		this.name = name;
		this.descreption = descreption;
	}

	public Category(String name, String descreption) {
		this.name = name;
		this.descreption = descreption;
	}

	public Category(String name) {
		this.name = name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}

}
