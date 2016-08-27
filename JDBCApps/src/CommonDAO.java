import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

// This class contains the DB Connection Only
// and all the DAO is calling the CommonDAO to 
//reterive the connection


// Singleton - it is a design pattern
// Create Single Object Only
public class CommonDAO {
	// 1. Eager Singleton - Object is already there when class is loaded
	// 2. Lazy Singleton - Object create on demand
	//private static CommonDAO commonDAOObject= new CommonDAO();
	private static CommonDAO commonDAOObject ;
	// this is private constructor
	private CommonDAO(){
		
	}
	
	public static  CommonDAO getObject(){
		synchronized(CommonDAO.class){
		if(commonDAOObject==null){
			commonDAOObject = new CommonDAO();
		}
		}
		return commonDAOObject;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		// To Read Property File
		ResourceBundle rb = ResourceBundle.getBundle("db");
		Class.forName(rb.getString("drivername"));
		Connection con= DriverManager.
				getConnection(rb.getString("dburl")
						,rb.getString("userid")
						,rb.getString("password"));
		return con;
	}
	
	
}
