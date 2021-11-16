package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserReg {
	public static void saveData(String name, long mob, String mail, String st, String city, int pin, String pas, String cpas) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
		String sql = "insert into book_reg values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setLong(2, mob);
		ps.setString(3, mail);
		ps.setString(4, st);
		ps.setString(5, city);
		ps.setInt(6, pin);
		ps.setString(7, pas);
		ps.setString(8, cpas);
		int n = ps.executeUpdate();
	}
}
