package oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkeedlist {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		LinkedList b = new LinkedList();
		b.add(10);
		b.add("yogesh");
		b.add(30.12);
		System.out.println(b);
		a.add("yogesh");
		a.add("nandu");
		a.add("nandu");
		a.add("abraham");
		System.out.println(a);
		System.out.println(a.poll());
		System.out.println(a);//removed head yogesh after poll method
		System.out.println(a.pop());
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a);
		
		Iterator i = a.iterator();
		Iterator j = b.iterator();
		while (i.hasNext()) {
			//System.out.println(i.next());
		}

	}

}
