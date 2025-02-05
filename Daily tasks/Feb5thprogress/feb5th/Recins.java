package feb5th;
import java.sql.*;
import java.util.Scanner;

public class Recins {
    static void insertData(Connection con, Scanner scan) throws SQLException {
        System.out.println("Enter Employee Id, Name, and Salary:");
        int empId = scan.nextInt();
        String empName = scan.next();
        int empSal = scan.nextInt();
        PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
        pstmt.setInt(1, empId);
        pstmt.setString(2, empName);
        pstmt.setInt(3, empSal);
        int value = pstmt.executeUpdate();
        System.out.println(value + " Row inserted");
        pstmt.close();
        System.out.println("Insert more rows? (yes/no)");
        if (scan.next().equalsIgnoreCase("yes")) insertData(con, scan);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false", "root", "tiger");
        insertData(con, scan);
        con.close();
    }
}
