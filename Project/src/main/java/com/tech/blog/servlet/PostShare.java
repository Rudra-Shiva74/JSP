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
import com.tech.blog.entity.SharePost;
import com.tech.blog.entity.User;
import com.tech.blog.helper.DBConnection;

@MultipartConfig
public class PostShare extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {
			int cid = Integer.parseInt(request.getParameter("cid"));
			String category = request.getParameter("categori");
			String tittle = request.getParameter("tittle");
			String content = request.getParameter("content");
			String program = request.getParameter("program");
			category = category.trim();
			String image = "dummy.jpg";
			Part part = null;
			HttpSession session = request.getSession(false);
			User user1 = (User) session.getAttribute("user");
			String email = user1.getEmail();
			String name = user1.getName();
			String userimg = user1.getImage();
			try {
				part = request.getPart("img");

				String img = email.substring(0, email.indexOf("@"));
				String originalFilename = part.getSubmittedFileName();
				String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
				image = category + tittle + img + extension;

				image = image.replaceAll("[^a-zA-Z0-9]", "");
				category = category.trim();
			} catch (Exception e) {
				e.printStackTrace();
			}
			SharePost post = new SharePost();
			post.setCid(cid);
			post.setCategory(category);
			post.setContent(content);
			post.setImage(image);
			post.setProgram(program);
			post.setTittle(tittle);

			UserDao user = new UserDao(DBConnection.createConnection());
			String userString = user.RegisterPost(post, email, name, userimg);
			if (userString.equals("DONE")) {
				try {
					if (!image.equals("dummy.jpg")) {
						InputStream is = part.getInputStream();
						byte[] data = new byte[is.available()];
						is.read(data);
						String path = request.getServletContext().getRealPath("/") + "post" + File.separator + image;
						System.out.println(path);
						FileOutputStream fos = new FileOutputStream(path);
						fos.write(data);
						fos.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				out.print("DONE");
			} else {
				out.print("Something went wrong!");
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
