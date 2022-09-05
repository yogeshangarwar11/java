package oops;

import java.util.Hashtable;
import java.util.Map;

public class HHashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> r = new Hashtable<Integer,String>();
		r.put(12, "int");
		r.put(13, "double");
		r.put(14, "float");
		r.put(14, "byte");
		r.put(15, "long");
		for(Map.Entry m: r.entrySet()){
			System.out.println(m.getKey() + "  " + m.getValue());
		}
		for(Map.Entry o : r.entrySet()){
			System.out.println(o.getKey()+" "+o.getValue());
		}

	}

}
