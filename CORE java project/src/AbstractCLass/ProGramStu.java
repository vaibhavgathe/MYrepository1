package AbstractCLass;

public class ProGramStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//add single number in string
		String s = "45dss5dfcdsf8adasf6";
		String s1="";
		int temp=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				s1=s1+s.charAt(i);
				int s3 = Integer.parseInt(s1);
				temp=temp+s3;
				s1="";
				
			}
		}
		System.out.println(temp);
		
	}

}
