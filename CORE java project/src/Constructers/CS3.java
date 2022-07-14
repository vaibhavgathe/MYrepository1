package Constructers;

public class CS3 {
   int a;  // variable declaration
   int b;  // variable declaration
   int c; // variable declaration
   String f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CS3 c3 = new CS3();
       c3.mul();
       CS3 c31 = new CS3(5, "ghjk");
       c31.mul();
       CS3 c32 = new CS3(500, 100);
       c32.mul();
    
       
	}
public CS3()
{
	a = 50;
	b = 100;
	c = 150;
}
public CS3(int x,String d)
{
	a = x;
	f = d;
}
public CS3(int x,int y)
{
	a = x;
	b = y;
	
}
public void mul()
{
	int mul = a*b;
	System.out.println("The Multiplication is "+mul);
	System.out.println("sycgiasucuiaj "+f);
}
}
