package StringConcept;

public class SPlitStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pq = "i:love:my:india";
		String [] spiltedString = pq.split(":");
		
		for(int i=0 ; i<=spiltedString.length-1 ; i++)
		{
			System.out.println(spiltedString[i]);
		}
	
	System.out.println("================");
	String u = "i am vaibhav";
	String [] pqr = u.split(" ");
	
	for(int i = 0 ; i<=pqr.length-1 ; i++)
	{
		System.out.println(pqr[i]);
	}
	}
}
