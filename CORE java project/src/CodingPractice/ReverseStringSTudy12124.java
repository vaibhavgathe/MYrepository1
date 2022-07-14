package CodingPractice;

public class ReverseStringSTudy12124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "#@$acc##@@&enture";
		
//		String s1 = "";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			s1 = s1 + s.charAt(i);
//		}
//		System.out.println(s1);
//		System.out.println("===========");
//		StringBuffer st = new StringBuffer(s);
//		System.out.println(st.reverse());
//		
		//String str= "This#string%contains^special*characters&.";   
	str = str.replaceAll("[@#$&]", "");  
		System.out.println(str); 
		
		
//		 String str = "#@$acc##@@&enture";
//	        System.out.println(str.replaceAll("[@#$&]", ""))
	}

}
