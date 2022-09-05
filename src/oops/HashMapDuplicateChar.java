package oops;

import java.util.*;

public class HashMapDuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name you want : ");
		String s = sc.nextLine();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		hm.put('r', 1);
		hm.put('e', 2);
		hm.put('t', 3);
		hm.put('y', 4);
		hm.put('o', 5);
		String ss= s.toLowerCase();
		char q[] = ss.toCharArray();
		for(char z:q) {
			if (hm.containsKey(z)) {
				hm.put(z,hm.get(z));
			}
			else{hm.put(z,1);
			}
			
			}
	    for(Map.Entry m:hm.entrySet()) {
	    	System.out.println(m.getKey()+" "+m.getValue());
	    	
	}
	}

}
