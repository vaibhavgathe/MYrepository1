package InterfaceStudy;

public class ImpementationClass implements Interface1 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpementationClass i = new ImpementationClass();
		i.test1();
		i.test2();
		i.test3();
		
	System.out.println(Interface1.a);
	System.out.println(Interface1.b);
		

	}

	@Override
	public void test1() {
		
		System.out.println("This Is the Overrided method 1 from interface");
	}

	@Override
	public void test2() {
		
		System.out.println("This Is the Overrided method 2 from interface");
	}

}
