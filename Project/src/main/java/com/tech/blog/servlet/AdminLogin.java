package com.tech.blog.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entity.AdminBean;
import com.tech.blog.entity.Massage;
import com.tech.blog.helper.DBConnection;

@MultipartConfig
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try (PrintWriter out = response.getWriter()) {
			HttpSession session = request.getSession(false);
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			AdminBean adminBean = new AdminBean();
			adminBean.setAdminemail(email);
			adminBean.setAdminpass(password);
			UserDao user = new UserDao(DBConnection.createConnection());
			AdminBean Adminbean = user.getAdmin(adminBean);
			if (Adminbean == null) {
				Massage msg = new Massage("alert-danger", "Invalid Details!", "Please try again");
				session.setAttribute("error", msg);
				response.sendRedirect("adminlogin.jsp");
			} else {
				session.setAttribute("admin", Adminbean);
				response.sendRedirect("index.jsp");
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
