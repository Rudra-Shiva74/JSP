package com.mvc;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try (PrintWriter out = resp.getWriter()) {
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			LoginBean loginBean = new LoginBean();
			loginBean.setName(name);
			req.setAttribute("bean", loginBean);
			loginBean.setPasswor(password);
			System.out.println(loginBean.getName());
			if (loginBean.validate(password)) {
				req.getRequestDispatcher("profile.jsp").forward(req, resp);
			} else {
				req.getRequestDispatcher("error.jsp").forward(req, resp);
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
