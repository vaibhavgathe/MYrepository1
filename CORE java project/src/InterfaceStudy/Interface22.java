package InterfaceStudy;

public interface Interface22 extends Interface11 {

	public void Car();
	
	public void Mobile();
	
	default void Book()
	{
		System.out.println("sons watch");
	}
	
}
