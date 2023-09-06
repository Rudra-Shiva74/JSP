package com.servlet;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class PrintTable extends TagSupport {
	public int number;

	public void setNumber(int number) {
		this.number = number;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String color;

	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter outJspWriter = pageContext.getOut();
			for (int i = 1; i <= 10; i++) {
				outJspWriter.print("<h1>" + (i * number) + "</h1><br>");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return SKIP_BODY;
	}
}
