import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step -1 Load the Driver (Loading a Class)
		String driverName = "com.mysql.jdbc.Driver";
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Class.forName("com.mysql.jdbc.Driver");
		// Driver is loaded because we need to communicate to the database
		// driver can talk to the lowlevel database things
		// driver is high level thing 
		Class.forName(driverName);
		// Step -2 Create Connection
		// Default Port no for Oracle is 1521
		// jdbc:oracle:thin:@ipaddress:portno:dbname
		// mysql Default Port No 3306
		// jdbc:mysql://hostname:port/dbname
		String dbURL = "jdbc:mysql://localhost:3306/mydb";
		String userid = "root";
		String password = "amit123456";
		Connection con = DriverManager.getConnection(dbURL,userid,password);
		if(con!=null){
			System.out.println("Connection Created...");
		}
		// Step-3 DO Query and Get the Result
		Statement stmt = con.createStatement();
		ResultSet rs = 
				stmt.executeQuery
				("select id,name,salary from employee");
		
		// Step -4 Traverse the ResultSet
		// rs.next() return true if there is a Row in ResultSet
		while(rs.next()){
			System.out.println(rs.getInt("id")+" "
		+rs.getString("name")+" "+rs.getDouble("salary"));
		}
		// Step -5 Close all the open resources
		// What Ever is open last must be close first
		rs.close();
		stmt.close();
		con.close();
		
		
		

	}

}
