
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcExample {

	public static void main(String[] args) throws SQLException {
		//Create Connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","system","orcl");
		//Create a query
		
		Statement stmt=(Statement) con.createStatement();
		String s="insert into student values(101,'scott')";
        ((java.sql.Statement) stmt).executeQuery(s);
        con.close();
        System.out.println("Completed");
	}

}