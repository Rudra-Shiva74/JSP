package com.tech.blog.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entity.Category;
import com.tech.blog.helper.DBConnection;

@MultipartConfig
public class AddTopic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {
			String category = request.getParameter("category");
			String desc = request.getParameter("desc");
			Category cat = new Category(category, desc);
			UserDao user = new UserDao(DBConnection.createConnection());
			String addcat = user.AddCategoty(cat);
			if (addcat.equals("DONE")) {
				System.out.println("DONE");
				out.print("DONE");
			} else {
				out.print("Sorry! Something went wrong");
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
