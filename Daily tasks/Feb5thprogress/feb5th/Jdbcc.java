package feb5th;

import java.sql.*;

public class Jdbcc {
public static void main(String args[]) throws SQLException,Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?autoReconnect=true&useSSL=false","root","tiger");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select * from user");
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getInt(2));
		System.out.println(rs.getInt(3));
	}
	
	rs.close();
	stmt.close();
	con.close();
   }
}