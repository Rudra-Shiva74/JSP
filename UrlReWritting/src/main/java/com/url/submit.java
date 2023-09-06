package com.url;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class submit
 */
public class submit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		try (PrintWriter out = resp.getWriter()) {
			String name = req.getParameter("name");
			String number = req.getParameter("number");

			// here we are using url rewritting
			// out.print("<a href='url?name=" + name + "&number=" + number + "'>click
			// here</a>");

			// Here we are usign hidden field
			out.print("<form action=\"url\">\r\n" + "		<input type=\"hidden\" value=" + name
					+ " name=\"name\">\r\n" + "		<input type=\"hidden\" value=" + number + "  name=\"number\">\r\n"
					+ "		<input type=\"submit\" value=\"Submit\">\r\n" + "	</form>");
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
