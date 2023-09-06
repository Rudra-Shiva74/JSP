package com.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class servlet1 extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		req.setAttribute("number1", num1);
		req.setAttribute("number2", num2);
		
//		out.print("<h1>Hello </h1>");
		
		RequestDispatcher rd=req.getRequestDispatcher("servlet2");
		rd.forward(req, resp);
	}

}
