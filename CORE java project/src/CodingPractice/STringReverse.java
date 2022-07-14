package CodingPractice;

public class STringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "vaibhav";
		String rev = "";
	// using for loop	
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);
	
		// using string buffer method
		
		StringBuffer s1 = new StringBuffer("velocity");
		
		System.out.println(s1.reverse());
		
		// using string builder method
		
        StringBuilder s2 = new StringBuilder("abhishek");
		
		System.out.println(s1.reverse());
		
	}

}
