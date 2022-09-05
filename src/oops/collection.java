package oops;

import java.util.*;

public class collection {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("yogesh");
		a.add("naveen");
		a.add("vineeth");
		a.add("sakshi");
		System.out.println(a);
		Iterator i = a.iterator();
		System.out.print("printing elements of arraylist separately is =  ");
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		a.add(1,"vinay");
		System.out.println("arraylist after adding vinay element to list at 1st position will be " + a);
		a.set(1, "shiva"); 
		System.out.println("arraylist after replacing vinay with shiva will be " + a);
		a.remove(1);
		System.out.println("arraylist after removing 1st element will be " +a);
		System.out.println("Does array list contains yogesh element ? " + a.contains("yogesh"));
		System.out.println("element at 1st position is " + a.get(1));
		a.clear();
		System.out.println("after clearing arraylist it will be " + a);
		System.out.println("whether arraylist is empty = " + a.isEmpty());
		
	}

}
