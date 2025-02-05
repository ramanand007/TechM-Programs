package feb5th;
import java.sql.*;
import java.util.Scanner;

public class UpdateRow {
public static void main(String args[]) throws Exception,SQLException {
	Scanner scan = new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false","root","tiger");
	updateData(con, scan);
	con.close();
  }

static void updateData(Connection con, Scanner scan) throws SQLException {
	System.out.println("Enter the current Employee Name to update:");
	String currentName = scan.next();
	System.out.println("Enter the new Employee Name:");
	String newName = scan.next();
	PreparedStatement ps = con.prepareStatement("update emp set empname=? where empname=?");
	ps.setString(1, newName);
	ps.setString(2, currentName);
	int value = ps.executeUpdate();
	System.out.println(value + " Row updated in the table");
	ps.close();
}
}