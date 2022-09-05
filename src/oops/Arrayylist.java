package oops;

import java.util.*;

import java.util.Iterator;

public class Arrayylist {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		ArrayList b = new ArrayList();
		b.add(10);
		b.add(23);
		b.add(30);
		System.out.println(b);
		a.add("yogesh");
		a.add("nandu");
		a.add("nandu");
		a.add("abraham");
		Collections.sort(a);
		System.out.println("after sorting of arraylist a = " + a);
		System.out.println(b.contains(10));
		System.out.println(a);
		a.set(1, "vinay");
		System.out.println(a);//replaces the specific element at a specific position
		ArrayList c = new ArrayList();
		c = (ArrayList)a.clone();
		System.out.println("duplicate array list is : " + c);
		System.out.println("the size of Array List of c is :" + c.size());
		System.out.println("whether c ArrayList contains yogesh ? " + c.contains("yogesh"));
	    System.out.println("Element at 2nd position : " + c.get(1));
		a.clear();
		System.out.println(a);//removes all the elements in a array list
		System.out.println("the array list of a is empty or not? : " + a.isEmpty());
		//System.out.println(a.poll());
		//System.out.println(a.peek());
		//Iterator i = a.iterator();
		Iterator j = b.iterator();
		
		    ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(12);
		    numbers.add(8);
		    numbers.add(2);
		    numbers.add(23);
		    Iterator<Integer> it = numbers.iterator();
		    while(it.hasNext()) {
		      Integer i = it.next();
		      if(i < 10) {
		        it.remove();
		        //System.out.println(i);
		      }
		    }
		    System.out.println(numbers);
		  }
		   

	}

 
