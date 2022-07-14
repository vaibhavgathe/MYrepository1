package TypeCAsting;

public class UpcastingResult {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		Upcasting111 u1  = new Upcasting111();
				u1.car();
				u1.home();
				
		Upcasting222 u2 = new Upcasting222();
		u2.car();
		u2.home();
		u2.book();
		System.out.println("============================");
		
		Upcasting222 u3 = new Upcasting111();
		u3.car();
		u3.home();
		
		System.out.println("==================");
	Upcasting111 u4 = (Upcasting111) new Upcasting222();
		u4.home();
		u4.car();
		
		
		
		
		
	
		
		
	}

}
