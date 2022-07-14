package SwitchCase;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String UN = "Velocity";
		String password = "abcd234";
		
		
		 if("Velocity" == UN)
		 {
			 System.out.println("Username is correct,plz enter password");
			 
			 if("abcd1234" == password)
			 {
				 System.out.println("the password is correct");
			 }
			 else
			 {
				 System.out.println("the password is incoorect");
			 }
			 
		 }
		 else
		 {
			 System.out.println("invalid user id");
		 }
	}

}
