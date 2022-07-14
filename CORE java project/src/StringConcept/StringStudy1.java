package StringConcept;

public class StringStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Velocity";
		String Test = "Velocity";
		String Test3 = "Velocity1545";
		String Test1 = new String("Velocity");
		
          
		
		System.out.println(Test.length());
		System.out.println("=============================");
		   int CallString = Test.length();
		   System.out.println("The String is "+Test.length());
		  System.out.println("=================================");
		   String up = s.toUpperCase();
		   System.out.println("Upper Case String is "+ s.toUpperCase() );
		   System.out.println("================================");
		   
		   System.out.println(s != Test);
		   System.out.println("=================");
		   System.out.println(Test == Test3);
		   System.out.println("=========================");
		   System.out.println(s == Test);
	}

}
