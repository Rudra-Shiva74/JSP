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

/**
 * Servlet implementation class DeleteTopic
 */
@MultipartConfig
public class DeleteTopic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {
			String name = request.getParameter("category");
			Category c = new Category(name);
			UserDao user = new UserDao(DBConnection.createConnection());
			String result = user.DeleteCategory(c);
			if (result.equals("DONE")) {
				out.print("DONE");
			} else {
				out.print("Sorry! something went wrong");
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
