package Methods;

public class MethodWithoutpara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		info();
		MethodWithParaNUM mwn = new MethodWithParaNUM();
		mwn.add1(15000, 15000);
		

	}
		
		public static void info()
		{
			
			String name = "Ramesh";
			String mobilenum = "545454";
			float age = 54.2f;
			char gender = 'M';
			
			System.out.println("=====================================");
			System.out.println("The name is "+name);
			System.out.println("The mobilenum is "+mobilenum);
			System.out.println("The age is "+age);
			System.out.println("The gender is "+gender);
			System.out.println("======================================");
			
			
		}
		
}
