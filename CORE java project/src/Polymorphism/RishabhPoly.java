package Polymorphism;

public class RishabhPoly{
	
	public static void main(String[] args) {
		
		RishabhPoly rp = new RishabhPoly();
		rp.sum();
		rp.sum(40, 50);
		rp.sum(5.2f, 4);
		
		// Method OverLoading
	}
	
	public void sum()
	{
		System.out.println("sum");
	}
	public void sum(int x,int y)
	{
	
		int sum = x+y;
		System.out.println(sum);
	}
	public void sum(float c,int b)
	{
		float sum = c+b;
		System.out.println(sum);
	}
}


