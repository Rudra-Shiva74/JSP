package com.tech.blog.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entity.User;
import com.tech.blog.helper.DBConnection;

@MultipartConfig
public class Profilupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {

			HttpSession session = request.getSession(false);
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			String password = request.getParameter("password");
			String about = request.getParameter("about");

			User userimg = (User) session.getAttribute("user");
			String image = userimg.getImage();
			System.out.println(image);
			Part part = null;
			try {
				part = request.getPart("img");
				System.out.println(part);
				// get the email using session
				String email = (String) session.getAttribute("userid");

				String originalFilename = part.getSubmittedFileName();
				String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
				image = email.substring(0, email.indexOf("@")) + extension;
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(image);
			User user = new User();
			user.setName(name);
			user.setGender(gender);
			user.setPassword(password);
			user.setAbout(about);
			user.setImage(image);
			User user2 = (User) session.getAttribute("user");
			UserDao userDao = new UserDao(DBConnection.createConnection());
			String result = userDao.updateuser(user, user2);
			if (result.equals("DONE")) {
				try {

					InputStream is = part.getInputStream();
					byte[] data = new byte[is.available()];
					is.read(data);
					String path = request.getServletContext().getRealPath("/") + "images" + File.separator + image;
					System.out.println(path);
					FileOutputStream fos = new FileOutputStream(path);
					fos.write(data);
					fos.close();
					System.out.println(path);
					System.out.print("connect");
				} catch (Exception e) {
					e.printStackTrace();
				}
				out.print("DONE");
				System.out.println("DONE");
			} else {
				out.print("Something wrong with you");
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
