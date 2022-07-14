package Methods;

public class MethodWithParaNUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithParaNUM.math();
		
		MethodWithParaNUM mwn = new MethodWithParaNUM();
		mwn.math1(5, 5);
		mwn.math2(100,200);
		mwn.add1(15000,15000);

	}

	public static void math()
	{	
	int x = 5;
	int y = 10;
	int add=(x+y);
	int mul=(x*y);
	int sub=(x-y);
	int div=(x/y);
	System.out.println("===========================");
	System.out.println(add);
	System.out.println(mul);
	System.out.println(sub);
	System.out.println(div);
	System.out.println("===========================");
	}
	
	public void math1(int x, int y)
	{
		int add=(x+y);
		int mul=(x*y);
		int sub=(x-y);
		int div=(x/y);
		
		System.out.println("===========================");
		System.out.println(add);
		System.out.println(mul);
		System.out.println(sub);
		System.out.println(div);
		System.out.println("===========================");
	}
	public void math2(int a, int b)
	{
		int add=(a+b);
		int sub=(a-b);
		int mul=(a*b);
		int div=(a/b);
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	public void add1(int x, int y)
	{	
		int z = x+y;
		System.out.println(z);
	}
}
