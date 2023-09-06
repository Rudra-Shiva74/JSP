package mvc.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import mvc.bean.Massage;
import mvc.bean.RegisterBean;
import mvc.dao.RegisterDao;
import mvc.util.DBConnection;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {
			String email = request.getParameter("email");
			String passString = request.getParameter("password");
			RegisterDao user = new RegisterDao(DBConnection.createConnection());
			RegisterBean beanuser = user.logibuser(email, passString);
			HttpSession session = request.getSession(false);
			if (beanuser != null) {
				session.setAttribute("user", beanuser);
				response.sendRedirect("profile.jsp");
			} else {
				Massage msg = new Massage("Login Failed!", "bg-danger");
				session.setAttribute("error", msg);
				response.sendRedirect("login.jsp");

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
