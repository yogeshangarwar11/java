package oops;

public class WrapperClass {

	public static void main(String[] args) {
		int i =23;
		double d = 42.0;
		float f = 55.8f;
		long l = 456;
		short s = 22;
		
		Integer a = i;
		Double b = d;
		Float c = f;
		Long o = l;
		Short e = s;
		System.out.println(a+b+c+o+e);
		
		int n = a;
		double v = b;
		float u = c;
		long t = o;
		//short q = e;
		System.out.println(n+v+u+t);

	}

}
