package ThisAndSuperKeyword;

public class ThisKEyword {
	int a = 500;
	int b = 300;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ThisKEyword tk = new ThisKEyword ();
		tk.Test();
		
	}
   public void Test()
   {
	 int  sum =  this.a+100;
	   System.out.println(sum);
   }
	
	
}
