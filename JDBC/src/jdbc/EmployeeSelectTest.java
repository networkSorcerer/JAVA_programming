package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeSelectTest {
	public static void main(String []args) {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try {
		con= ConnectDatabase.makeConnection("hr","hr1234");
		stmt = con.createStatement();
		String sql= "SELECT employee_id, first_name, salary, hire_date, department_id from employees";
		
		rs = stmt.executeQuery(sql);
		
		System.out.println("**** Employee Information ****\n");
		while (rs.next()) {
			System.out.print(rs.getInt("employee_id")+ "\t");
			System.out.print(rs.getString("first_name")+ "\t");
			System.out.print(rs.getDouble("salary")+ "\t");
			System.out.print(rs.getString("hire_date")+ "\t");
			System.out.print(rs.getString("department_id"));
		}
	} catch (SQLException s) {
		System.out.println("[SQL Query Error] \n" +s.getMessage());
		s.printStackTrace();
	} finally {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		} catch (SQLException sqle) {
			System.out.println("CLOSE ERROR");
		}
	}
  }
}
