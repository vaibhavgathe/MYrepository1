package AbstractCLass;

import java.util.HashSet;

public class programsSTudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdb1bb5efa1b9cdef";
		String numString = "";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(!Character.isDigit(s.charAt(i)))
			{
				numString = numString+s.charAt(i);
			}
		}		System.out.println(numString);
	
		
		 
		
		
		
	}

}
