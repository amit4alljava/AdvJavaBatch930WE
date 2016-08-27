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
		if(choice ==1){
			
		}
		else
		if(choice ==2){	
			System.out.println("Enter the Userid ");
			String userid = scanner.next();
			System.out.println("Enter the Password");
			String password = scanner.next();
			UserDAO dao = new UserDAO();
			try {
				dao.registerUser();
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
