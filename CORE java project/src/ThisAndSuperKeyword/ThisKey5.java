package ThisAndSuperKeyword;

public class ThisKey5 {
	int a = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		ThisKey5 t = new ThisKey5();
		t.Test1();
		
	}
public void Test1()
{   
	int a = 40;
	int sum = 100+this.a;
	System.out.println(sum);
}
}
