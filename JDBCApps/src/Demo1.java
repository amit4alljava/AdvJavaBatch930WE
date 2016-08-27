import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
		boolean isFound = false;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Salary");
		String entersalary = scanner.nextLine();
		System.out.println("Enter the Name");
		String name = scanner.nextLine();
		
		String dbURL = "jdbc:mysql://localhost:3306/mydb";
		String userid = "root";
		String password = "amit123456";
		Connection con = DriverManager.getConnection(dbURL,userid,password);
		if(con!=null){
			System.out.println("Connection Created...");
		}
		// Step-3 DO Query and Get the Result
		// ? is a PlaceHolder
		PreparedStatement pstmt = con
				.prepareStatement
				("select id ,name ,salary from employee"
						+ " where salary>? and name=?");
		// I am Setting the 1st ? Value
		pstmt.setDouble(1, Double.parseDouble(entersalary));
		pstmt.setString(2, name);
		ResultSet rs = pstmt.executeQuery();
		
		//Statement stmt = con.createStatement(); 
		// NO SQL Injection Prevention
		//ResultSet rs = 
		//		stmt.executeQuery
		//		("select id,name,salary from employee where salary>"+entersalary);
		
		// Step -4 Traverse the ResultSet
		// rs.next() return true if there is a Row in ResultSet
		while(rs.next()){
			isFound = true;
			System.out.println(rs.getInt("id")+" "
		+rs.getString("name")+" "+rs.getDouble("salary"));
		}
		if(!isFound){
			System.out.println("No Record Found...");
		}
		// Step -5 Close all the open resources
		// What Ever is open last must be close first
		rs.close();
		pstmt.close();
		//stmt.close();
		con.close();
		
		
		

	}

}
