package ThisAndSuperKeyword;

public class SuperKey6 extends ThisKey5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKey6 sk = new SuperKey6();
		sk.Test9();
				
	}
  public void Test9()
  {
	 int sum = 100+super.a;
	  System.out.println(sum);
  }
}
