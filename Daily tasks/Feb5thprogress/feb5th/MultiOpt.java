package feb5th;
import java.sql.*;
import java.util.Scanner;

public class MultiOpt {
    public static void main(String args[]) throws Exception, SQLException {
        Scanner scan = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false", "root", "tiger");
        while (true) {
            System.out.println("Menu:\n1. Insert a new Row\n2. Update a Row\n3. Delete a Row\n4. Select a Row\n5. Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1: 
                	ins(con, scan);
                	break;
                case 2:
                	upd(con, scan);
                	break;
                case 3:
                	del(con, scan);
                	break;
                case 4:
                	sel(con, scan);
                	break;
                case 5:
                	con.close(); System.exit(0);
                default: System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void ins(Connection con, Scanner scan) throws SQLException {
        System.out.println("Enter the Employee Id:");
        int empId = scan.nextInt();
        System.out.println("Enter the Employee Name:");
        String empName = scan.next();
        System.out.println("Enter the Employee Salary:");
        int empSal = scan.nextInt();
        PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
        pstmt.setInt(1, empId);
        pstmt.setString(2, empName);
        pstmt.setInt(3, empSal);
        int value = pstmt.executeUpdate();
        System.out.println(value + " Row inserted into the table");
        pstmt.close();
    }

    static void upd(Connection con, Scanner scan) throws SQLException {
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

    static void del(Connection con, Scanner scan) throws SQLException {
        System.out.println("Enter the Employee Name to delete:");
        String empName = scan.next();
        PreparedStatement ps = con.prepareStatement("delete from emp where empname=?");
        ps.setString(1, empName);
        int value = ps.executeUpdate();
        System.out.println(value + " Row deleted from the table");
        ps.close();
    }

    static void sel(Connection con, Scanner scan) throws SQLException {
        System.out.println("Enter the Employee Name to select:");
        String empName = scan.next();
        PreparedStatement ps = con.prepareStatement("select * from emp where empname=?");
        ps.setString(1, empName);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("Id: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Salary: " + rs.getInt(3));
        }
        rs.close();
        ps.close();
    }
}
