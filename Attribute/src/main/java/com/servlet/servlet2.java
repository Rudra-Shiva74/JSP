package com.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class servlet2 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		int numb1 = Integer.parseInt(req.getParameter("num1"));
		int numb2 = Integer.parseInt(req.getParameter("num2"));
		int num1 = Integer.parseInt((String) req.getAttribute("number1"));
		int num2 = Integer.parseInt((String) req.getAttribute("number2"));
		PrintWriter out = resp.getWriter();
		out.print("<h1>The sum of number is " + (num1 + num2) + "</h1><br>");
		out.print("<h1>The product of number is " + (numb1 * numb2) + "</h1>");
	}
}
