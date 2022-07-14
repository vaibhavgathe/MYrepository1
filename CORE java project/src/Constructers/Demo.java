package Constructers;

public class Demo {
	  Demo()
	  {
	    this(5);
	    System.out.println("The Default constructor");
	  }
	  Demo(int x)
	  {
	    this(5, 15);
	    System.out.println("One-argument constructor");
	    System.out.println(x);
	  }
	  Demo(int x, int y)
	  {
	    System.out.println("Two-argument constructor");
	    System.out.println(x * y);
	  }
	  public static void main(String args[])
	  {
	   Demo d=new Demo(20);
	   
	   
	  }
	
}