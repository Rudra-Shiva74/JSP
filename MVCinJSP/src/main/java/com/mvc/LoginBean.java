package com.mvc;

public class LoginBean {
	public String name, passwor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswor() {
		return passwor;
	}

	public void setPasswor(String passwor) {
		this.passwor = passwor;
	}

	public boolean validate(String str) {
		if (str.equals("admin"))
			return true;
		else {
			return false;
		}
	}
}
