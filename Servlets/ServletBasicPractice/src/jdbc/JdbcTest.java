package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {
	public static void saveData(String u, String p) throws ClassNotFoundException, SQLException
	{
		String s = "insert into servTest values(?,?)";				
		Class.forName("oracle.jdbc.driver.OracleDriver");			
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
		PreparedStatement ps=con.prepareStatement(s);
		ps.setString(1, u);
		ps.setString(2, p);
		int n = ps.executeUpdate();		
	}

}
