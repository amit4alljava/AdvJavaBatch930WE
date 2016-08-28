import java.sql.SQLException;
import java.util.Scanner;

public class UserView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("Enter the Choice ");
		Scanner scanner= new Scanner(System.in);
		int choice = scanner.nextInt();
		if(choice ==2){
			System.out.println("Enter the Userid ");
			String userid = scanner.next();
			System.out.println("Enter the Password");
			String password = scanner.next();
			UserDTO userDTO = new UserDTO();
			userDTO.setUserid(userid);
			userDTO.setPassword(password);
			UserDAO dao = new UserDAO();
			try {
				String status = dao.register(userDTO);
				if(status.equals(StatusConstants.SUCCESS)){
					System.out.println("user register....");
				}
				else
				{
					System.out.println("Can't Register");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		if(choice ==1){	
			System.out.println("Enter the Userid ");
			String userid = scanner.next();
			System.out.println("Enter the Password");
			String password = scanner.next();
			UserDTO userDTO = new UserDTO();
			userDTO.setUserid(userid);
			userDTO.setPassword(password);
			UserDAO dao = new UserDAO();
			try {
				String status = dao.login(userDTO);
				if(status.equals(StatusConstants.SUCCESS )){
					System.out.println("Welcome "+userid);
				}
				else
				{
					System.out.println("Invalid Userid or Password...");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
