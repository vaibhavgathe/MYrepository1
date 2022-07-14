package Constructers;

public class CS4 {
int a;
int b;
int c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CS4 cs = new CS4();
      cs.mul();
      CS4 cs1 = new CS4(5);
      cs1.mul();
      CS4 cs2 = new CS4(4, 5);
      cs2.mul();
      CS4 cs7 = new CS4(2, 5, 4);
      cs7.mul();
	}
public CS4()
{
	a = 50;
	b = 59;
	c = 60;
}
public CS4(int x)
{
	a = x;
}
public CS4(int x, int y)
{
	a = x;
	b = y;
}
public CS4(int x,int y, int z)
{
	a = x;
	b = y;
	c = z;
}
public void mul()
{
	int mul = a*b*c;
	System.out.println("The Multiplication is "+mul);
}

}
