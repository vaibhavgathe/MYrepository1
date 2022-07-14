package Accsessmodifers;

public class Accessmodifier {
	int x = 10; //default
	public int y = 20;//public
	private int  z = 30;//private
	protected int s = 40;//protected
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void sum()
	{
		System.out.println("My method is sum");
	}
	private static void sum1()
	{
		System.out.println("My method is sum1");
	}
	void sum2() 
	{
		System.out.println("My method is sum2");
	}
	protected void sum3()
	{
		System.out.println("My method is sum3");
	}
}
