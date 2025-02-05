package feb5th;
import java.sql.*;
import java.util.Scanner;

public class DelRow {
public static void main(String args[]) throws Exception,SQLException {
	Scanner scan = new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false","root","tiger");
	deleteData(con, scan);
	con.close();
  }

static void deleteData(Connection con, Scanner scan) throws SQLException {
	System.out.println("Enter the Employee Id to delete:");
	int empid = scan.nextInt();
	PreparedStatement ps = con.prepareStatement("delete from emp where empid=?");
	ps.setInt(1, empid);
	int value = ps.executeUpdate();
	System.out.println(value + " is deleted from the table");
	ps.close();
}
}
