package ThisAndSuperKeyword;

public class SUperKeyword extends ThisKEyword {
  static int sa;
  int d = 8000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUperKeyword sk =new SUperKeyword();
		sk.Test();
		sk.Test1();
		Test2();
	}
   public void Test1()
   {   
	   sa = 400;
	   System.out.println(sa);
	   int sum = super.b+500;
	   System.out.println(sum);
   }
   public static void Test2()
   {
	   sa = 400;
	   System.out.println(sa);
   }
}
