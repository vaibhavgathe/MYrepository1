package Collectionstudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.text.ElementIterator;

import org.graalvm.compiler.lir.amd64.vector.AMD64VectorMove.VectorLoadOp;

public class LiSTArrayANdIterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList<>();
		
		al.add("vaibhav");
		al.add('B');
		al.add(null);
		al.add(null);
		al.add(123);
		al.add("vaibhav");
		
		System.out.println(al);
		
		al.add(2, 57);
		
		System.out.println(al);
		System.out.println("===========================");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("===========================");
		
		for(Object m:al)
		{
			System.out.println(m);
		}
		
		System.out.println("===========================");
		
		ListIterator l = al.listIterator();
		System.out.println("===============");
		while (l.hasNext()) 
		{
			System.out.println(l.next());
		}
		
		System.out.println("================================ ");
		
	    Iterator k = al.iterator();
		
		while(k.hasNext())
		{
			System.out.println(k.next());
		}
		
		
		System.out.println(al.isEmpty());
		System.out.println(al.contains("vaibhav"));
		System.out.println(al.indexOf(null));
		System.out.println(al.size());
		System.out.println(al.remove(3));
		System.out.println(al.get(0));
		System.out.print(al.lastIndexOf(al));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
