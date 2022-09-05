package oops;

public class StaticInnerClass {
	private static int i ;
	public void function(){
		System.out.println("outer class " + i);
	}
	static class Inner{
		float f;
		public void function1() {
			StaticInnerClass o = new StaticInnerClass();
			System.out.println("Inner class " + (f+o.i));
		}
	}

	public static void main(String[] args) {
		StaticInnerClass o = new StaticInnerClass();
		o.i = 10;
		o.function();
		StaticInnerClass.Inner in = new StaticInnerClass.Inner();
		in.f = 1.5f;
		in.function1();

	}

}
