package oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;

public class HashhMap {

	public static void main(String[] args) {
		HashMap <Integer, String> m = new HashMap<Integer, String> ();
		TreeMap <Double, Integer> a = new TreeMap<Double, Integer>();
		LinkedHashMap<Integer,Float> b = new LinkedHashMap<Integer,Float>();
		m.put(1, "yogesh");
		m.put(2, "sing");
		m.put(3, "very");
		m.put(4, "well");
		System.out.println(m);
		
		//non generic method
		Set s = m.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry e = (Map.Entry)i.next();
			System.out.println(e.getKey() + " " + e.getValue()   );
		}
		
		//Generic Method
		for(Map.Entry n : m.entrySet()){
			System.out.println(n.getKey()+" "+n.getValue());
		}
		a.put(10.0, 1);
		a.put(10.1, 2);
		a.put(10.2, 3);
		a.put(10.3, 4);
		for(Map.Entry r : a.entrySet()){
			System.out.println(r.getKey()+" "+r.getValue());
		}
		b.put(1, 10.2f);
		b.put(2, 21.3f);
		b.put(3, 32.5f);
		b.put(4, 783.0f);
		b.put(4, null);
		b.put(5, null);
		b.put(null, 34.6f);
		b.put(null, 23.5f);
		
		for(Map.Entry n : b.entrySet()){
			System.out.println(n.getKey()+" "+n.getValue());
		}
	
	}

}
