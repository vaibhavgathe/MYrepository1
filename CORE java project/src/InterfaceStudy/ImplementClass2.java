package InterfaceStudy;

public class ImplementClass2 implements Interface11,Interface22{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		 ImplementClass2 i = new  ImplementClass2();
		 i.Car();
		 i.Home();
		 i.Mobile();
		 i.Love();
		 i.watch();
		 i.Book();
		 


}

	@Override
	public void Car() {
		// TODO Auto-generated method stub
		System.out.println("Father Cars");
	}

	@Override
	public void Mobile() {
		// TODO Auto-generated method stub
		System.out.println("Father mobile");
	}

	@Override
	public void Home() {
		// TODO Auto-generated method stub
		System.out.println("sons home");
	}

	@Override
	public void Love() {
		// TODO Auto-generated method stub
		System.out.println("sons love");
	}
	
}