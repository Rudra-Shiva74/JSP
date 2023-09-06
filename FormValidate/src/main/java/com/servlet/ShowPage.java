package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ShowPage
 */
public class ShowPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try (PrintWriter out = resp.getWriter()) {
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			String email = req.getParameter("email");
			String gender = req.getParameter("gender");
			String select = req.getParameter("select");
			String check = req.getParameter("checkbox");
			if (check != null) {
				out.print("<br><h1>" + name + "</h1>");
				out.print("<br><h1>" + password + "</h1>");
				out.print("<br><h1>" + email + "</h1>");
				out.print("<br><h1>" + gender + "</h1>");
				out.print("<br><h1>" + select + "</h1>");
			} else {
				out.print("<h1>plzz check checkbox</h1>");
				req.getRequestDispatcher("index.html").include(req, resp);
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
