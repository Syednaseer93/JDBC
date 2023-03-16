import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FhshvyF {

	public static void main(String[] args) throws SQLException {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","system","orcl");
			Statement stmt = con.createStatement();
			String s="select EMPID,EMPNAME,DEPTNO,SALARY from EMPLOYEE";
			ResultSet rs=stmt.executeQuery(s);
			while(rs.next())
			{
				int employeeid=rs.getInt("EMPID");
				String employeename=rs.getString("EMPNAME");
				int departmentno=rs.getInt("DEPTNO");
				int sal=rs.getInt("SALARY");
				
				System.out.println(employeeid+"     "+employeename+"     "+departmentno+"     "+sal);
				
			}
			con.close();
			System.out.println("completed");
			

	}

}
