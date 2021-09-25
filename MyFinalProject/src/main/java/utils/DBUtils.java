package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.UserAccount;
import beans.Enrollee;

public class DBUtils {
	
	public static UserAccount findUser(Connection conn, //
			String userName, String password) throws SQLException {

		String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a " //
				+ " where a.User_Name = ? and a.password= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, userName);
		pstm.setString(2, password);
		ResultSet rs = pstm.executeQuery();

		if (rs.next()) {
			//String gender = rs.getString("Gender");
			UserAccount user = new UserAccount();
			user.setUserName(userName);
			user.setPassword(password);
			//user.setGender(gender);
			return user;
		}
		return null;
	}

	public static UserAccount findUser(Connection conn, String userName) throws SQLException {

		String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a "//
				+ " where a.User_Name = ? ";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, userName);

		ResultSet rs = pstm.executeQuery();

		if (rs.next()) {
			String password = rs.getString("Password");
			//String gender = rs.getString("Gender");
			UserAccount user = new UserAccount();
			user.setUserName(userName);
			user.setPassword(password);
			//user.setGender(gender);
			return user;
		}
		return null;
	}

	public static List<Enrollee> queryEnrollee(Connection conn) throws SQLException {
		String sql = "Select a.id, a.fullName, a.passport, a.userID from Enrollee a ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<Enrollee> list = new ArrayList<Enrollee>();
		while (rs.next()) {
			Integer id = rs.getInt("ID");
			String fullname = rs.getString("FullName");
			String passport = rs.getString("Passport");
			Integer userid = rs.getInt("UserID");
			Enrollee enrollee = new Enrollee(id, fullname, passport, userid);
			enrollee.setID(id);
			enrollee.setFullName(fullname);
			enrollee.setPassport(passport);
			enrollee.setUserID(userid);
			list.add(enrollee);
		}
		return list;
	}

	public static Enrollee findEnrollee(Connection conn, Integer userID) throws SQLException {
		String sql = "Select a.id, a.fullName, a.passport, a.userID from Enrollee a where a.userID=?";

		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, userID);

		ResultSet rs = pstm.executeQuery();

		while (rs.next()) {
			String fullname = rs.getString("FullName");
			String passport = rs.getString("Passort");
			Integer userid = rs.getInt("UserID");
			Enrollee enrollee = new Enrollee(userID, fullname, passport, userid);
			return enrollee;
		}
		return null;
	}

	public static void updateEnrollee(Connection conn, Enrollee enrollee) throws SQLException {
		String sql = "Update Erollee set ID =?, set FullName =?, Passport=? where id=? ";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, enrollee.getID());
		pstm.setString(2, enrollee.getFullName());
		pstm.setString(3, enrollee.getPassport());
		pstm.setInt(3, enrollee.getUserID());
		pstm.executeUpdate();
	}

	public static void insertEnrollee(Connection conn, Enrollee enrollee) throws SQLException {
		String sql = "Insert into Enrollee(id, FullName, Passport, UserID) values (?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, enrollee.getID());
		pstm.setString(2, enrollee.getFullName());
		pstm.setString(3, enrollee.getPassport());
		pstm.setInt(3, enrollee.getUserID());
		pstm.executeUpdate();
	}

	public static void deleteEnrollee(Connection conn, Integer userID) throws SQLException {
		String sql = "Delete From Enrollee where UerID= ?";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setInt(1, userID);

		pstm.executeUpdate();
	}


}
