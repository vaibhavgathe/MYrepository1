package Collectionstudy;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet<>();
		
		hs.add(null);
		hs.add(null);
		hs.add("vaibhav");
		hs.add('A');
		hs.add("vaibhav");
		
		System.out.println(hs);
		
		Iterator a = hs.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		System.out.println("===========");
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
		System.out.println("===========");
		
		
		
		System.out.println(hs.isEmpty());
		hs.clear();
	}

}
