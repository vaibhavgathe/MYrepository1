package Constructers;

public class CS87 {
   int x;
   int y;  // variable declaration
   int z;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CS87 c = new CS87();
		c.mul();
		CS87 c1 = new CS87(10, 50, 30);
		c1.mul();
		

	}
  public CS87()
  {
	  x = 10;
	  y = 20;   // variable initialization
	  z = 30;
	  
  }
  public CS87(int a,int b,int c)
  {
	  x = a;
	  y = b;    // variable initialization
	  z = c;
  }
  public void mul()
  {
	int mul = x*y*z;
	System.out.println("the value of mul is "+mul);    //Usage
  }
}
