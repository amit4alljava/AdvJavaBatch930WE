import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO Contains the DB Logic
// DAO Stands For Data Access Object
public class UserDAO {
	
	
	public String register(UserDTO userDTO) throws SQLException, ClassNotFoundException{
		CommonDAO commonDAO = CommonDAO.getObject();
		Connection con=null;
		PreparedStatement pstmt = null;
		
		try{
		con = commonDAO.getConnection();
		if(con==null){
			return StatusConstants.ERROR;
		}
		pstmt = con.prepareStatement(SQLConstants.REGISTER_SQL);
		pstmt.setString(1, userDTO.getUserid());
		pstmt.setString(2, userDTO.getPassword());
		int recordEffected = pstmt.executeUpdate();
		if(recordEffected>0){
			return StatusConstants.SUCCESS;
		}
		else
		{
			return StatusConstants.FAIL;
		}
		}
		finally{
			if(pstmt!=null)
			{
				pstmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
		
	}
	
	public String login(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		CommonDAO commonDAO = CommonDAO.getObject();
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
		con = commonDAO.getConnection();
		if(con==null){
			return StatusConstants.ERROR;
		}
		pstmt = con.prepareStatement(SQLConstants.LOGIN_SQL);
		pstmt.setString(1, userDTO.getUserid());
		pstmt.setString(2, userDTO.getPassword());
		rs = pstmt.executeQuery();
		if(rs.next()){
			return StatusConstants.SUCCESS;
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
		return StatusConstants.FAIL;
	}

}
