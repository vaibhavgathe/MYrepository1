package StringConcept;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Velocity";
		String i = "";
		String x = "velocity";
		String f = "124578";
		String d = "Velocity is a future";
		
		System.out.println(s.equals(x));// equals function is case sensitive
		System.out.println("===================================");
		System.out.println(s.equalsIgnoreCase(s));//equals function without case sensitivity
		System.out.println("===================================");
		System.out.println(s.contains("city"));//checks the wording in string but use it in double quote
		System.out.println(x.contains("yt"));//wrong sequence not possible
		System.out.println("===================================");
		
		System.out.println(s.isEmpty());
		System.out.println(f.isEmpty());//checks whether the string is empty or not
		System.out.println("===================================");
		System.out.println(s.startsWith("Velo"));//checks the string starts with or not
		System.out.println(s.startsWith("velocity"));//wrong input "v" check string s
		System.out.println("===================================");
		System.out.println(x.endsWith("ty"));
		System.out.println(x.endsWith("locity"));//checks the string ends with
		System.out.println(x.endsWith("V"));//checks the string ends with
		System.out.println("====================================");
		System.out.println(x.charAt(4));//checks the index no of character in string
		System.out.println(x.charAt(7));
		//System.out.println(x.charAt(20));out of string indexing not possible...showing exception...means run time error
		System.out.println("====================================");
		System.out.println(d.substring(8));//shows the string afterwards the integer number taken 
		System.out.println(d.substring(1));
		System.out.println("====================================");
		System.out.println(s.concat(d));
		System.out.println(s.concat(f));//addition or integration of two string=
		System.out.println("*********************************");
		System.out.println(s.indexOf("c"));
		
		
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");	
		String u = "i love my india";
		System.out.println(u.substring(3,9));
	}

}
