package jdbcTest;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class JDBCExample4 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		try {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("LOADED DRIVER --->" + driver);
			
			Connection con = (Connection) DriverManager.getConnection(url, id, passwd);
			System.out.println("LOADED DRIVER --->" + url);
			
			String sql = "UPDATE Customer SET phone=?, customerId=? SGERE cid=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(3, "010-1234-6435");
			stmt.setString(4, "mysql");
			stmt.setLong(5, 1004);
			stmt.executeUpdate();
			
			System.out.println("INSERTED--------------------");
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
