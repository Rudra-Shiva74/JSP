package mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mvc.bean.RegisterBean;

public class RegisterDao {
	private Connection con;

	public RegisterDao(Connection con) {
		this.con = con;
	}

	public String registerUser(RegisterBean registerBean) {
		String fullName = registerBean.getFullName();
		String email = registerBean.getEmail();
		String userName = registerBean.getUserName();
		String password = registerBean.getPassword();

		PreparedStatement preparedStatement = null;
		try {
			String query = "insert into users(fullName,Email,userName,password) values (?,?,?,?)";
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, fullName);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, password);

			int i = preparedStatement.executeUpdate();

			if (i != 0) { // Just to ensure data has been inserted into the database
				return "SUCCESS";

			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.print("Hello World");
		}
		return "UNSUCCESS";
	}

	public RegisterBean logibuser(String email, String password) {
		RegisterBean user = null;
		String quString = "select * from users where Email=? and password=?";
		try {
			PreparedStatement ppst = con.prepareStatement(quString);
			ppst.setString(1, email);
			ppst.setString(2, password);
			ResultSet rs = ppst.executeQuery();
			System.out.println(con);
			if (rs.next()) {
				user = new RegisterBean();
				user.setEmail(rs.getString("Email"));
				user.setFullName(rs.getString("fullName"));
				user.setUserName(rs.getString("userName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
