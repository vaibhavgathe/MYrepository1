package InterfaceStudy;

public interface Interface11 {

	public void Home();
	
	public void Love();
	
	default void watch()
	{
		System.out.println("FAthers watch");
	}
	
	
}
