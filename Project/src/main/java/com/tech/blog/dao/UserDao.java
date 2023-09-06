package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tech.blog.entity.*;

public class UserDao {

	private Connection conn = null;

	// Constructor of userdao
	public UserDao(Connection conn) {

		this.conn = conn;
	}

	// This Function insert data in to databases;
	public String RegisterDao(User user) {
		String name = user.getName();
		String email = user.getEmail();
		String password = user.getPassword();
		String gender = user.getGender();
		String about = user.getAbout();

		try {
			String query = "insert into registration(username,emailid,password, gender, about) values(?,?,?,?,?)";
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setString(1, name);
			ppst.setString(2, email);
			ppst.setString(3, password);
			ppst.setString(4, gender);
			ppst.setString(5, about);
			int i = ppst.executeUpdate();
			if (i != 0) {
				System.out.println("done");
				System.out.println(i);
				return "DONE";
			} else {
				System.out.println("not done");
				System.out.println(i);
				return "NOT";

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "NOT";
	}

	// This is Function is userd to fetch user from database;
	public User getUserbyemailandpassword(String email, String password) {
		User user = null;
		try {
			String querString = "select * from registration where emailid = ? and password=?";
			PreparedStatement ppst = conn.prepareStatement(querString);
			ppst.setString(1, email);
			ppst.setString(2, password);
			ResultSet rs = ppst.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setName(rs.getString("username"));
				user.setEmail(rs.getString("emailid"));
				user.setGender(rs.getString("gender"));
				user.setAbout(rs.getString("about"));
				user.setDatetime(rs.getString("rdate"));
				user.setPassword(rs.getString("password"));
				user.setImage(rs.getString("image"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}

	public String updateuser(User user, User user2) {
		String name = user.getName();
		String gender = user.getGender();
		String pass = user.getPassword();
		String about = user.getAbout();
		String image = user.getImage();
		User User2 = null;
		try {
			String query = "update registration set username=?,password=?,gender=?,about=?,image=? where emailid=?";
			String queString = "update post set username=?, userimg=? where emailid=?";
			PreparedStatement psst = conn.prepareStatement(queString);
			psst.setString(1, name);
			psst.setString(2, image);
			psst.setString(3, user2.getEmail());
			psst.executeUpdate();
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setString(1, name);
			ppst.setString(2, pass);
			ppst.setString(3, gender);
			ppst.setString(4, about);
			ppst.setString(5, image);
			ppst.setString(6, user2.getEmail());
			int i = ppst.executeUpdate();
			if (i != 0) {
				user2.setAbout(about);
				user2.setName(name);
				user2.setGender(gender);
				user2.setImage(image);
				user2.setPassword(pass);
				return "DONE";
			} else {
				return "NOT";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "NOT";
	}

	public String RegisterPost(SharePost user, String email, String name, String userimg) {
		String category = user.getCategory();
		int cid = user.getCid();
		String tittle = user.getTittle();
		String content = user.getContent();
		String program = user.getProgram();
		String image = user.getImage();
		try {
			String query = "insert into post (emailid,catagori,title,content,program,cid,username,image,userimg) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setString(1, email);
			ppst.setString(2, category);
			ppst.setString(3, tittle);
			ppst.setString(4, content);
			ppst.setString(5, program);
			ppst.setInt(6, cid);
			ppst.setString(7, name);
			ppst.setString(8, image);
			ppst.setString(9, userimg);
			int i = ppst.executeUpdate();
			if (i != 0) {
				return "DONE";
			} else {
				return "NOT";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "NOT";
	}

	public ArrayList<Category> getCategories() {
		ArrayList<Category> list = new ArrayList<Category>();
		String query = "select * from category";
		try {

			PreparedStatement ppst = conn.prepareStatement(query);
			ResultSet rs = ppst.executeQuery();
			while (rs.next()) {
				int cid = rs.getInt("cid");
				String name = rs.getString("name");
				String desc = rs.getString("description");
				Category c = new Category(cid, name, desc);
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<SharePost> getallpost() {
		List<SharePost> post = new ArrayList<>();
		String query = "select * from post order by postid desc";
		try {
			PreparedStatement ppst = conn.prepareStatement(query);
			ResultSet rs = ppst.executeQuery();
			while (rs.next()) {
				int pid = rs.getInt("postid");
				String categgory = rs.getString("catagori");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String program = rs.getString("program");
				String image = rs.getString("image");
				String time = rs.getString("postdate");
//				String time = "";
//				SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy, HH:mm");
//
//				try {
//					Date date = (Date) inputFormat.parse(inputDate);
//					time = outputFormat.format(date);
//
//					System.out.println("Input Date: " + inputDate);
//					System.out.println("Formatted Date: " + time);
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
				String usermail = rs.getString("emailid");
				String userimg = rs.getString("userimg");
				System.out.println(usermail);
				String username = rs.getString("username");
				SharePost p = new SharePost(categgory, title, content, program, image, pid, time, usermail, username,
						userimg);
				post.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return post;
	}

	public List<SharePost> getpostbyid(int cid) {
		List<SharePost> post = new ArrayList<>();
		try {

			System.out.println(cid);
			String query = "select * from post where postid=?";
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setInt(1, cid);
			ResultSet rs = ppst.executeQuery();
			while (rs.next()) {
				int pid = rs.getInt("postid");
				String categgory = rs.getString("catagori");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String program = rs.getString("program");
				String image = rs.getString("image");
				String time = rs.getString("postdate");
				String usermail = rs.getString("emailid");
				String username = rs.getString("username");
				String userimg = rs.getString("userimg");
				SharePost p = new SharePost(categgory, title, content, program, image, pid, time, usermail, username,
						userimg);
				post.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return post;
	}

	public List<SharePost> getpostbyname(String cname) {
		List<SharePost> post = new ArrayList<>();
		try {

			String query = "select * from post where catagori=? order by postid desc";
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setString(1, cname);
			ResultSet rs = ppst.executeQuery();
			while (rs.next()) {
				int pid = rs.getInt("postid");
				String categgory = rs.getString("catagori");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String program = rs.getString("program");
				String image = rs.getString("image");
				String time = rs.getString("postdate");
//				String time = "";
//				SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy, HH:mm");
//
//				try {
//					Date date = (Date) inputFormat.parse(inputDate);
//					time = outputFormat.format(date);
//
//					System.out.println("Input Date: " + inputDate);
//					System.out.println("Formatted Date: " + time);
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
				String usermail = rs.getString("emailid");
				usermail = usermail.substring(0, usermail.indexOf("@"));
				System.out.println(usermail);
				String username = rs.getString("username");
				String userimg = rs.getString("userimg");
				SharePost p = new SharePost(categgory, title, content, program, image, pid, time, usermail, username,
						userimg);
				post.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return post;
	}

	public AdminBean getAdmin(AdminBean adminBean) {
		AdminBean adminBean2 = null;
		String email = adminBean.getAdminemail();
		String password = adminBean.getAdminpass();
		try {
			String query = "select * from admin where adminemail=? and adminpass=?";
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setString(1, email);
			ppst.setString(2, password);
			ResultSet rs = ppst.executeQuery();
			if (rs.next()) {
				adminBean2 = new AdminBean();
				adminBean2.setAdminid(rs.getInt("adminid"));
				adminBean2.setAdminname(rs.getString("adminname"));
				adminBean2.setAdminemail(rs.getString("adminemail"));
				adminBean2.setAdminimg(rs.getString("rdate"));
				return adminBean2;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return adminBean2;
	}

	public String AddCategoty(Category c) {
		String category = c.getName();
		String desc = c.getDescreption();
		try {
			String query = "insert into category(name,description) values(?,?)";
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setString(1, category);
			ppst.setString(2, desc);
			int i = ppst.executeUpdate();
			if (i != 0) {
				return "DONE";
			} else {
				return "NOT";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "NOT";
	}

	public String DeleteCategory(Category c) {
		String name = c.getName();
		try {
			String query = "delete from category where name=?";
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setString(1, name);
			int i = ppst.executeUpdate();
			if (i != 0) {
				return "DONE";
			} else {
				return "NOT";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "NOT";
	}

	public List<SharePost> getPostByUser(String email) {
		List<SharePost> list = new ArrayList<>();
		try {

			String query = "select * from post where emailid=?";
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setString(1, email);
			ResultSet rs = ppst.executeQuery();
			while (rs.next()) {
				int pid = rs.getInt("postid");
				String categori = rs.getString("catagori");
				String tittle = rs.getString("title");
				String content = rs.getString("content");
				String program = rs.getString("program");
				String img = rs.getString("image");
				String date = rs.getString("postdate");
				SharePost post = new SharePost(pid, categori, tittle, content, program, img, date);
				list.add(post);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public String like(int postid, String userid) {
		String query = "insert into likes (postid,userid) values(?,?)";
		try {
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setInt(1, postid);
			ppst.setString(2, userid);
			int i = ppst.executeUpdate();
			if (i != 0) {
				return "DONE";
			} else {
				return "NOT";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "NOT";
	}

	public int getlikeBypostId(int postid) {
		String query = "select * from likes where postid=?";
		int i = 1;
		try {
			PreparedStatement ppst = conn.prepareStatement(query);
			ppst.setInt(1, postid);
			ResultSet rs = ppst.executeQuery();
			while (rs.next()) {
				i++;
			}
			return i;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(i);
		return i;
	}

	public boolean likedbyuser(int postid, String userid) {
		String querry = "select * from likes where postid=? and userid=?";
		try {
			PreparedStatement ppst = conn.prepareStatement(querry);
			ppst.setInt(1, postid);
			ppst.setString(2, userid);
			ResultSet rs = ppst.executeQuery();
			if (rs.next()) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
