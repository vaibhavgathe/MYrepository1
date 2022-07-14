package Constructers;

public class CS2 {
	int a;  //Variable Declaration
	int b;  //Variable Declaration
	int c;  //Variable Declaration
    String p;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CS2 cs = new CS2();
		cs.sum();
		CS2 cs8 = new CS2();
		cs8.CS2(5,"gjhh");
				
		CS2 cs2 = new CS2(400, 900);
		cs2.sum();
		CS2 cs3 = new CS2(2, 3, 5);
		cs3.sum();
		CS3 c = new CS3();
		c.mul();

	}
public CS2()
{
	 a = 100;
	 b = 200;
     c = 300;
     System.out.println("hello guys");
}
public CS2(int x,String p )
{
	a = x;
	p = "Vaibhav";
}
public CS2(int x, int y)
{
	a = x;
	b = y;
}
public CS2(int x, int y, int z)
{
	a = x;
	b = y;
	c = z;
}
public void sum()
{
	
	int sum = a+b+c;
	String p = "VAibhav";
	System.out.println(sum);
	System.out.println(p);
}
}
