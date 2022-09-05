package oops;

public class implicitexplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int b = 3;
		char c = 65;
		double d = 30.22;
		byte r = 12;
		float f =10.22f;
		System.out.println(i+b-f);//implicit casting
		double g = i+b-f;
		System.out.println(g);
		int s = b/i;
		System.out.println(s);
		System.out.println(b/i);//before explicit casting
		float Q = (float)b/i;//Explicit casting
		System.out.println(Q);
		int a = 8;
		float e = 2.2f;
		int q = (int) (a/e);//*bracket is important here
		System.out.println(q);
		
	}

}
