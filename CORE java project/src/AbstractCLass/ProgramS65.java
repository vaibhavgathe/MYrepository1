package AbstractCLass;

public class ProgramS65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //addition of each number in string
		String s = "45dfgdf58dvd45dd78";
		String s1 = "";
		int temp=0;
		int flag=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				s1=s1+s.charAt(i);
				flag=1;
				if(i!=(s.length()-1))
					continue;
			}
			if(flag==1)
			{
				int val=Integer.parseInt(s1);
				s1="";
				temp=temp+val;
				flag=0;
			}
		}
		System.out.println(temp);
	}

}
