package com.tech.blog.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entity.Massage;
import com.tech.blog.entity.User;
import com.tech.blog.helper.DBConnection;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try (PrintWriter out = resp.getWriter()) {
			String email = req.getParameter("email");
			String pass = req.getParameter("password");
			HttpSession s = req.getSession();
			UserDao user = new UserDao(DBConnection.createConnection());
			User user2 = user.getUserbyemailandpassword(email, pass);
			if (user2 == null) {
				Massage msg = new Massage("alert-danger", "Invalid Details!", "Please try again");
				s.setAttribute("error", msg);
				resp.sendRedirect("login.jsp");
			} else {
				s.setAttribute("userid", user2.getEmail());
				s.setAttribute("user", user2);
				resp.sendRedirect(req.getContextPath() + "/");
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
