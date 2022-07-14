package CodingPractice;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("=========");
//		String s = "this is velocity";
//		String s1 = "";
//		String[] k = s.split(" ");
//		int d = k.length-1;
//		
//		for(int i=d;i>=0;i--)
//		{
//			System.out.print(k[i]);
//		}
		
//		String s = "sfjaejf5sdb8v7";
//		String s1="";
//		
//		for(int i=0;i<s.length();i++)
//		{
//			if(!Character.isDigit(s.charAt(i)))
//			{
//				s1=s1+s.charAt(i);
//			}
//		}
//		System.out.println(s1);
//		System.out.println(s);
//		
		
//		String s ="ABCDabcd";
//		String upper=""; 
//		int upper1=0;
//		String lower="";
//		int lower1=0;
//		
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char char1 = s.charAt(i);
//			if(char1>=65 && char1<=80)
//			{
//				upper=upper+char1;
//				upper1++;
//			}
//			else
//			{
//				lower=lower+char1;
//				lower1++;
//			}
//		}
//		System.out.println(upper);
//		System.out.println(upper1);
//		System.out.println(lower);
//		System.out.println(lower1);
//		
		String s = "@#$%^&5784Accenture";
		String l = s.replaceAll("[@#$%^&]", "" );
		System.out.println(l);
		
		
		
		
		
		
		
		
	}
	

}
