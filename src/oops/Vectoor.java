package oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Vectoor {

	public static void main(String[] args) {
		Vector<String> a = new Vector<String>();
		Vector b = new Vector();
		b.add(10);
		b.add("yogesh");
		b.add(30.12);
		System.out.println(b);
		a.add("yogesh");
		a.add("nandu");
		a.add("nandu");
		a.add("abraham");
		System.out.println(a);
		Iterator i = a.iterator();
		Iterator j = b.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
