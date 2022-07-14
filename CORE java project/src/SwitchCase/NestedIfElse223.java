package SwitchCase;

public class NestedIfElse223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String UI = "Velcity";
		String PWD = "abcd1234";
		int empid = 1234;
		
		if(UI == "Velocity")
		{
			System.out.println("User id is correct");
			
			if(PWD == "abcd1234")
			{
				System.out.println("passwoed is correct");
			
			if(empid == 1234)
			{
				System.out.println("empid is correct"+ "\n" + "above details are correct u r good to go!@");
			}
			else
				System.out.println("empid is incorrect");
			}
			else
				System.out.println("password is incorrect");
		}
		else
			System.out.println("user id is incorrect");
		}
		
	}

