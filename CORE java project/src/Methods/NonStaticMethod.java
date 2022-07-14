package Methods;

public class NonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		NonStaticMethod nsm = new NonStaticMethod();
		nsm.add();
		
	}

	public void mul()
	{
		
		int x = 12;
		int y = 10;
		int z = x*y;
		
		System.out.println(z);
		
	}
	
	public void add()
	{
		int x = 500;
		int y = 501;
		int z = x+y;
		System.out.println(z);
	}
	
	public void sub()
	{
		
		int x = 1000;
		int y = 500;
		int z = x-y;
		System.out.println(z);
		
	}
	
	public void div()
	{
		
		int a = 80;
		int b = 40;
		int c = a/b;
		System.out.println(c);
		
	}
}
