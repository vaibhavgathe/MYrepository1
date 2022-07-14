package AbstractCLass;

public class progrAMStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "acbsjsdaasss";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='s')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
