import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {

	public static void main(String[] args) throws SQLException {
		//Connection class create a connection between eclipse and database
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","system","orcl");
		//Create a query
		Statement stmt=con.createStatement();
		//to insert values into table
		String s="insert into TABLE10 values(1005,'scott','JAMES','LJHFUEE')";
	//	to update but make sure all column details must be updated
	//	String s="update TABLE10 set FIRSTNAME='KIM',LASTNAME='JOHN',ADDRESS='INDIA' where STUDENTID=1004";
	// 	String s="delete TABLE10 where STUDENTID=1005";
		stmt.executeQuery(s);
        con.close();
        System.out.println("Completed");
	}

}