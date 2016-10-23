package com.srivastava.apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SearchDAO {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException{
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driverName = rb.getString("driver");
		String url = rb.getString("databaseurl");
		String userid = rb.getString("userid");
		String password = rb.getString("password");
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url,userid,password);
		return con;
		
	}
	public ArrayList<PersonDTO> searchByName(String name) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<PersonDTO> personList = new ArrayList<>();
		try
		{
			con = this.getConnection();
			pstmt=con.prepareStatement("select id, name from person where name=?");
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()){
				PersonDTO personDTO = new PersonDTO();
				personDTO.setId(rs.getInt("id"));
				personDTO.setName(rs.getString("name"));
				personList.add(personDTO);
			}
		}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
		return personList;
	}

}
