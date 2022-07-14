package loopingstatement;

public class LoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		for(int i = 3 ; i<=30 ; i = i+1)
		{
			System.out.println(i);
		}
		System.out.println("=====================");
		int i = 4;
		while(i<=40)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("-----------------------");
		int s = 50;
		do
		{
			System.out.println(s);
			s=s-10;
		}
		while(s>=5);
		
	}

}
