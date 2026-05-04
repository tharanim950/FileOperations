package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeTable {
	
	    public static void main(String[] args) {
	        
	        String url = "jdbc:mysql://localhost:3306/employees";
	        String username = "root";
	        String password = "Root@1100";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(url, username, password);

	            String sql = "INSERT INTO employeelist (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
	            PreparedStatement ps = con.prepareStatement(sql);

	            
	            ps.setInt(1, 101);
	            ps.setString(2, "Jenny");
	            ps.setInt(3, 25);
	            ps.setDouble(4, 10000);
	            ps.executeUpdate();

	            
	            ps.setInt(1, 102);
	            ps.setString(2, "Jacky");
	            ps.setInt(3, 30);
	            ps.setDouble(4, 20000);
	            ps.executeUpdate();

	            
	            ps.setInt(1, 103);
	            ps.setString(2, "Joe");
	            ps.setInt(3, 20);
	            ps.setDouble(4, 40000);
	            ps.executeUpdate();

	            
	            ps.setInt(1, 104);
	            ps.setString(2, "John");
	            ps.setInt(3, 40);
	            ps.setDouble(4, 80000);
	            ps.executeUpdate();

	            
	            ps.setInt(1, 105);
	            ps.setString(2, "Shameer");
	            ps.setInt(3, 25);
	            ps.setDouble(4, 90000);
	            ps.executeUpdate();

	            System.out.println("All records inserted successfully!");

	            ps.close();
	            con.close();

	        } catch (Exception error) {
	            error.printStackTrace();
	        }
	    }
	}
