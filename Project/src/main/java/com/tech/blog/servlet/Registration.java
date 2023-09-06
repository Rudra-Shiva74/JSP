package com.tech.blog.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entity.User;
import com.tech.blog.helper.DBConnection;

/**
 * Servlet implementation class Registration
 */
@MultipartConfig
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		String cpass = req.getParameter("cpassword");
		String gender = req.getParameter("gender");
		String about = req.getParameter("about");
		String box = req.getParameter("box");
		System.out.println(box);
		if (box != null) {
			if (pass.equals(cpass)) {

				User user = new User();
				user.setName(name);
				user.setEmail(email);
				user.setPassword(cpass);
				user.setGender(gender);
				user.setAbout(about);

				UserDao userDao = new UserDao(DBConnection.createConnection());
				String userregister = userDao.RegisterDao(user);
				if (userregister.equals("DONE")) {
					out.print("DONE");
				} else {
					out.print("User already exist!");
				}
			} else {
				System.out.print("password do not match");
				out.print("password do not match!");
			}
		} else {
			System.out.print("Box is not check");
			out.print("Please check the box!");
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
