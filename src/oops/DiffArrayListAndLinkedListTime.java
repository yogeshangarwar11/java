package oops;

import java.util.ArrayList;
import java.util.LinkedList;

public class DiffArrayListAndLinkedListTime {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		for (int i = 1 ;i<=100000;i++) {
			String b ;
			  b = "name" ;
			  a.add(b);
		}                  
		long beginTime = System.currentTimeMillis();
		//a.set(99999,"vinn");
		a.remove(1);
		//System.out.println(a);
		//stem.out.println(a);
		long endTime = System.currentTimeMillis();
		//System.out.println("time taken to complete replacement of element in Array list is : " + (endTime-beginTime) +"ms");
		System.out.println(beginTime);
		System.out.println(endTime);
		//System.out.println(a);
		System.out.println(a.contains("name"));

//		ArrayList<String> a = new ArrayList<String>();
//		for (int i = 1 ;i<=10;i++) {
//			String b ;
//			  b = "name" ;
//			  a.add(b);
//		}                  
//		long beginTime = System.currentTimeMillis();
//		//a.set(99999,"vinn");
//		a.remove(1);
//		//System.out.println(a);
//		//stem.out.println(a);
//		long endTime = System.currentTimeMillis();
//		//System.out.println("time taken to complete replacement of element in Array list is : " + (endTime-beginTime) +"ms");
//		System.out.println(beginTime);
//		System.out.println(endTime);
//		System.out.println(a);
	}

}

