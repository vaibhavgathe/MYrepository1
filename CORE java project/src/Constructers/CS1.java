package Constructers;

public class CS1 {
	int a;
	int b;     // Variable Declaration
	int c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CS1 cs = new CS1();
		cs.sum();
		CS1 c1 = new CS1(500);
		c1.sum();
		CS1 c2 = new CS1(200,400);
		c2.sum();
		CS1 c3 = new CS1(5, 10, 20);
		c3.sum();
		

	}
public CS1 ()
{
	 a = 10;
	 b = 20;    // Variable initialtion
	 c = 30;
}
public CS1(int x)
{
	a = x;	
}
public CS1(int x,int y)
{
	a = x;
	b = y;
}
public CS1(int x,int y, int z)
{
	a = x;
	b = y;
	c = z;
}
public void sum()
{
	
	int sum = a+b+c;     // Varible Usage
	System.out.println(sum);
}

}
