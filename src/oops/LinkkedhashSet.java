package oops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkkedhashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Double> a = new LinkedHashSet<Double>();
		a.add(10.11);
		a.add(32.0);
		a.add(24.43);
		a.add(65.577);
		a.add(32.0);
		//System.out.println(a.element());//retrieves head value but does not delete 
		//System.out.println(a);
		//System.out.println(a.peek());//retrieves head value but does not delete
		System.out.println(a);
		//a.pop();//removed the last element
		Iterator <Double> x = a.iterator();
		//System.out.print("Elements after pop method = " );
		while(x.hasNext()) {
			System.out.println(x.next()+" ");
		
		}

	}

}
