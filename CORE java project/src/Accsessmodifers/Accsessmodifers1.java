package Accsessmodifers;

public class Accsessmodifers1 {

     public int x = 40;
     private int y = 50;

   
	
	public static void main(String[] args) {

	    
		Accsessmodifers1 am = new Accsessmodifers1();
		am.sum();
		
		System.out.println(am.y);
		System.out.println(am.x);
		
	}
public void sum()
{
   int	sum  = x+y;
	System.out.println(sum);
}
	
}