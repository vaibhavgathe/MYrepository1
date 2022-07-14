package InterfaceStudy;

public interface Interface1 {
	
	
	int a = 10;
	int b = 20;
	
	
	public void test1();
	
	public void test2();
	
	default void test3()
	{
		System.out.println("hi");
	}
	
	
}
