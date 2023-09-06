package com.tech.blog.entity;

public class Massage {
	private String css;
	private String contant;
	private String type;

	public Massage(String css, String contant, String type) {
		this.css = css;
		this.contant = contant;
		this.type = type;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getContant() {
		return contant;
	}

	public void setContant(String contant) {
		this.contant = contant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
