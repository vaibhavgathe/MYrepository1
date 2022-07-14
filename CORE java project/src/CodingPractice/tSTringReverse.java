package CodingPractice;

public class tSTringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	String s = "velocity";
		String rev ="";
		
		for(int i=s.length()-1;i>=0;i--)
		
		
			rev=rev+s.charAt(i);
			System.out.println(rev);*/
	/*	String s = "987654321";
		String rev ="";
		
		for(int i=s.length()-1;i>=2;i--)
		{
			rev = rev+s.charAt(i);
			System.out.println(rev);
		}*/
		
		String s = "velocityaaa";
		int s1=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				s1=s1+1;
			}
		}
			System.out.println(s1);
	System.out.println("=========================");	
		
		String s2 = "aoSJcbj";
		int count = 0;
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)=='o')
			{
				count = count+1;
			}
			
		}
		System.out.println(count);
		
	}

}
