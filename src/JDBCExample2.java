import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {

	public static void main(String[] args) throws SQLException {
		//Create Connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","system","orcl");
		//Create a query
		Statement stmt=con.createStatement();
		//to select values into table
		String s="select STUDENTID,FIRSTNAME,LASTNAME from TABLE10";
		ResultSet rs=stmt.executeQuery(s);
		while(rs.next())
			{
				int sid=rs.getInt("STUDENTID");
				String fname=rs.getString("FIRSTNAME");
				String lname=rs.getString("LASTNAME");
				System.out.println(sid+"     "+fname+"     "+lname);
			}
		
		con.close();
		System.out.println("Completed");
	}

}