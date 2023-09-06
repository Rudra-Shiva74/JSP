package com.tech.blog.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.tech.blog.dao.UserDao;
import com.tech.blog.helper.DBConnection;

/**
 * Servlet implementation class like
 */
public class like extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {
			int postid = Integer.parseInt(request.getParameter("postid"));
			String userid = (String) request.getParameter("userid");
			UserDao user = new UserDao(DBConnection.createConnection());
			String res = user.like(postid, userid);
			if (res.equals("DONE")) {
				System.out.println("DONE LIKE");
				out.print("DONE");
			} else {
				System.out.println("LIKE NOT DONE");
				out.print("NOT LIKE");
			}
		}
	}

}
