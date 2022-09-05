package oops;
import java.util.*;

public class ARrayyDequueue {

	public static void main(String[] args) {
		Deque<Float> a = new ArrayDeque<Float>();
		a.add(23.2f);
		a.add(231.2f);
		a.add(234.2f);
		a.add(423.2f);
		a.add(263.2f);
		System.out.println(a);
		a.addFirst(34.4f);
		Iterator<Float> b = a.iterator();
		for (Float r :a) {
			System.out.println(r);
		}
		System.out.println(a);
		a.addLast(56.32f);
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		System.out.println(a);
		

	}

}
