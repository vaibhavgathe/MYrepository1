package Collectionstudy;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList a = new ArrayList<>();
		
		a.add("string");
		a.add('B');
		a.add(2);
		a.add(null);
		a.add("vaibhav");
		a.add(5, "dhurv");
		a.add(1, "bishal");
		
		System.out.println(a);
		System.out.println("===============");
		System.out.println(a.get(3));
		
	for(int i=a.size()-1;i>=0;i--)
	{
		System.out.println(a.get(i));
	}
		
		
		
	}

}
