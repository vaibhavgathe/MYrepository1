package Collectionstudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashsetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet hs = new LinkedHashSet<>();
		
		hs.add(null);
		hs.add(null);
		hs.add("vaibhav");
		hs.add('A');
		hs.add("vaibhav");	
		
		System.out.println(hs);
		
		Iterator k = hs.iterator();
		
		while(k.hasNext())
		{
			System.out.println(k.next());
		}
		
		for(Object h:hs)
		{
			System.out.println(h);
		}
		
		
		
		
		
		
	}

}
