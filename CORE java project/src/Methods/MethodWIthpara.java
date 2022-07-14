package Methods;

public class MethodWIthpara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWIthpara mwp = new MethodWIthpara();
		mwp.studentinfo();
		
		
		mwp.studentinfo1("sacasc", 10f, "ascn", "scascasc", "cihbcid");
		
		MethodWIthpara.car("BMW", "AUDI", "LAMBO", "KIA");

	}

	public void studentinfo()
	{
		
		String name = "Rajat";
		int rollnumber = 21;
		String mobno = "4878845";
		String dist = "pune";
		String branch = "Information Technology";
		
		System.out.println("================================");
		System.out.println(name);
		System.out.println(rollnumber);
		System.out.println(mobno);
		System.out.println(dist);
		System.out.println(branch);
		System.out.println("=================================");
		
	}
	
	public void studentinfo1(String name,float rollnumber,String mobno,String dist,String branch)
	{
		System.out.println("==================================");
		System.out.println(name);
		System.out.println(rollnumber);
		System.out.println(mobno);
		System.out.println(dist);
		System.out.println(branch);
		System.out.println("==================================");
	}
	public static void car(String Name1,String Name2,String Name3,String Name4)
	{
		System.out.println("==================================");
		System.out.println(Name1);
		System.out.println(Name2);
		System.out.println(Name3);
		System.out.println(Name4);
		System.out.println("==================================");
	
		
		
	}
}
