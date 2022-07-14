package Methods;

public class MethosStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x = 5;
	int y = 10;
	
	int z = x+y;
	
	System.out.println(z);
	
	StaticClass1();
	sub();
	add();
	mul();
	StaticMethod.add();
	StaticMethod.sub();
	StaticMethod.mul();

	}
	// Static Method Of Same Class 1st Example
    public static void StaticClass1()
    {
    	
   
	String s = "Velocity";
	
	System.out.println("The String is "+s);
    }
    // Static Method Of Same Class 2nd Example
    
    public static void sub()
    {
    	
  
    
    int x = 10;
    int y = 5;
    
    int z = x-y;  
    System.out.println(z);
    }
    
 // Static Method Of Same Class 3rd Example
    
    public static void add()
    {
    
    int x = 8;
    int y = 5;
    int z = y+x;
    System.out.println(z);
    }
    
    public static void mul()
    {
    	
    	int x = 8;
    	int y = 7;
    	int z = y*x;
    
    	System.out.println(z);
    	
    	
    }
}