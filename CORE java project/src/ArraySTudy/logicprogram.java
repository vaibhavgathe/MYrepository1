package ArraySTudy;

public class logicprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ABCDabcd";
		String upper="";
		String lower="";
		int upper1=0;
		int lower1=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>=65 && ch<=80)
			{
				upper=upper+ch;
				upper1++;
			}
			else
			{
				lower=lower+ch;
				lower1++;
			}
			
		}
		System.out.println(upper);
		System.out.println(upper1);
		System.out.println(lower);
		System.out.println(lower1);
		
	}

}
