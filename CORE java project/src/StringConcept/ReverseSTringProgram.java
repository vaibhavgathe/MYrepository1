package StringConcept;

public class ReverseSTringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "velocity";
		String x = "";
		
		for(int i = s.length()-1 ; i>=0 ; i=i-1)
		
			x = x+s.charAt(i);
			System.out.println(x);
			
		System.out.println("================================");
		
			String d = "vaibhav";
			String n = "";
			
			for(int i =d.length()-1 ; i>=0 ; i--)
			
				n = n + d.charAt(i);
				System.out.println(n);
			
			
		
	}

}
