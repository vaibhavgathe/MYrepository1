package Collectionstudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList<>();
		
		ll.add("study");
		ll.add(123);
		ll.add(null);
		ll.add(null);
		ll.add("study");
		ll.add('D');
		ll.add(false);
		
		System.out.println(ll);
		
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("================================");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("================================");

		for(Object j:ll)
		{
			System.out.println(j);
		}
		
		System.out.println("================================");
		System.out.println("================================");


		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
	}

}
