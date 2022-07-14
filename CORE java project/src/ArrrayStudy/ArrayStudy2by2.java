package ArrrayStudy;

public class ArrayStudy2by2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String s[][] = {{"1","2"},{"3","4"}};
		
		for(int i = 0 ; i<=s.length-1 ; i++)
		{
			for(int j = 0 ; j<=s.length-1 ; j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println(" ");
		}
		Stringbuffer d = new Stringbuffer("velocity");
		
		
		
	}

}
