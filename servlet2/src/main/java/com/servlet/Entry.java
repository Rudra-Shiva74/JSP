package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = { "/test1", "/test2" }, initParams = { @WebInitParam(name = "firstname", value = "Abhishek"),
		@WebInitParam(name = "lastname", value = "Tiwari") })
public class Entry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try (PrintWriter out = resp.getWriter()) {
			req.setAttribute("n1", req.getParameter("num1"));
			req.setAttribute("n2", req.getParameter("num2"));
			String action = req.getParameter("action");

			String email = getServletConfig().getInitParameter("Email");
			String website = getServletContext().getInitParameter("Website-name");
			ServletConfig config = getServletConfig();
			ServletContext context = getServletContext();

			String firstname = getInitParameter("firstname");
			String lastname = getInitParameter("lastname");
			out.println(firstname);
			out.println(lastname);

			out.print(email);
			out.print(website);
//			if (action.equals("Add")) {
//				req.getRequestDispatcher("/Add").forward(req, resp);
//			} else {
//				req.getRequestDispatcher("/Substract").forward(req, resp);
//			}
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
