package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {

	ServletConfig conf;

	@Override
	public void destroy() {
		System.out.println("Destroying the servlet");

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		return "Abhishek Tiwari";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("This is init method");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("This is service method");
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		out.print("Hello Abhishek Tiwari");

	}
}
