package oops;

public class MemInnerClass {
	private int e;
	public static int function(int x, int y) {
		int r = x + y/2;
		int w = r * 2;
		int t = w * 3;
		return t;	
	}
	class Inner{
		double d;
		public void function1() {
			System.out.println("inner class " + (e+d));
			int u = function(3,6);
			System.out.println(u);
		}
	}
	public static void main(String[] args) {
		MemInnerClass i = new MemInnerClass();
		int p = i.function(3,4);
		System.out.println(p);
		i.e=55;
		System.out.println(i.e);
		MemInnerClass.Inner f = i.new Inner();
		f.d = 4.3;
		System.out.println(f.d);
		f.function1();

	}

}
