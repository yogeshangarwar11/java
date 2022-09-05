package oops;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SSortedSet {

	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet<Integer>();
		s.add(12);
		s.add(24);
		s.add(48);
		s.add(36);
		System.out.println(s);
		Iterator i =s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
