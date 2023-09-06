package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Abhishek extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			String action = request.getParameter("action");
			switch (action) {
			case "Addition":
				out.print("<h1>Addition of two number is " + (num1 + num2) + "<h1>");
				break;
			case "Substract":
				out.print("<h1>Substract of two number is " + (num1 - num2) + "<h1>");
				break;
			case "Division":
				out.print("<h1>Division of two number is " + (num1 / num2) + "<h1>");
				break;
			case "Multiplication":
				out.print("<h1>Multiplication of two number is " + (num1 * num2) + "<h1>");
			case "Modules":
				out.print("<h1>Modules of two number is " + (num1 % num2) + "<h1>");
				break;
			default:
				out.print("<h1>Sorry! Invalid <h1>");
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);

	}
}
