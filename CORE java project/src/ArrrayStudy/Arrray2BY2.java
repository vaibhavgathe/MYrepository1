package ArrrayStudy;

public class Arrray2BY2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[][] = {{"vaibhav","rahul"},{"ramesh","ajay"}};
		String d[][] = {{"1","2"},{"3","4"}};
		
		String f[] = {"velocity"};
		
		for(int i =0;i<=0;i++)
		{
			System.out.println(f[i]);
		}
			
			
		
		
	/*	for(int i=0;i<=s.length-1;i++)
		{
			for(int j=0 ; j<=s.length-1 ; j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println(" ");
}
*/
		
		System.out.println("=============================");
		
		for(int i = d.length-1;i>=0;i--)
		{
			for(int j = d.length-1;j>=0;j--)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
