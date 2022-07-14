package LocalAndGlobalVariable;

public class LocalAndGlobalVar {
  
	int x = 54;
	int y = 78;
	static int z = 45;
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.info();
		LocalAndGlobalVar lg = new LocalAndGlobalVar();
		System.out.println(lg.x);
		
	System.out.println("dvsdvsdvv " +z);
	
	int sum = 100 + s.p;
	System.out.println(sum);
	
	int sum1 = 100 + s.q;
	System.out.println(sum1);

		
	}
public void test()
{
	int mul = x*y;
	System.out.println(mul);
}
public static void test1()
{
	int sum = 10 + z;
	System.out.println(sum);
}
}
