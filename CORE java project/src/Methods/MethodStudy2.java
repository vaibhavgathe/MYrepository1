package Methods;

public class MethodStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d = "Velocity Placement";
		System.out.println("The String is "+ d);

		// Non Static Method From Same CLass Example 1
		
		MethodStudy2 m = new MethodStudy2();
		m.sub();
		
		// Non Static Method From Same CLass Example 2
		
		m.add();
		
		// Non Static Method From Same CLass Example 3
		
		m.String();
		
		// Non Static Method From Other CLass Example 1
		
		NonStaticMethod n = new NonStaticMethod();
				n.mul();
				
		// Non Static Method From Other CLass Example 2
			
				n.add();
		
		// Non Static Method From Other CLass Example 2
				n.sub();
		
		// Non Static Method From Other CLass Example 3
				
				n.div();
				
	}
	
	public void sub()
	{
		
	  int x = 80;
	  int y = 100;
	  int z = y-x;
	  
	  System.out.println(z);
		
	}

	public void add()
	{
		int x = 50;
		int y = 51;
		int z = x+y;
		System.out.println(z);
	}
	
	public void String()
	{
		
		String s = "Velocity is life";
		System.out.println(s);
		
	}
}
