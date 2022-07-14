package Collectionstudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorWithIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector<>();
		
		v.add("gathe");
		v.add('D');
		v.add(null);
		v.add(null);
		v.add(125);
		v.add("gathe");
		
		System.out.println(v);
		
		Enumeration a = v.elements();
		
		while(a.hasMoreElements())
		{
			System.out.println(a.nextElement());
		}
		
		ListIterator s = v.listIterator();
		System.out.println("==============================");
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		System.out.println("==============================");
		Iterator d = v.iterator();
		
		while(d.hasNext())
		{
			System.out.println(d.next());
		}
		
		System.out.println("==============================");
		
		for(Object n:v)
		{
			System.out.println(n);
		}
		
		System.out.println("==============================");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		
		
		
		
	}

}
