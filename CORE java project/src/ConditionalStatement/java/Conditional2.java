package ConditionalStatement.java;

public class Conditional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		char grade = 'A';
		
		if(grade == 'A')
		{
			System.out.println("The marks range is 75 to 90");
		}
		else if(grade == 'B')
		{
			System.out.println("The marks range is 60 to 75");
		}
		else if(grade == 'C')
		{
			System.out.println("The marks range is 45 to 60");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}

}
