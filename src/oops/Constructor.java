package oops;

public class Constructor {
	private int i;
	public void func() {
		System.out.println("outer class" + i);
	}
	class inner{
		float f;
		public void func1() {
			System.out.println("inner class" + (f+i));
		}
		public inner() {
			System.out.println("this is constructor");
		}
	}

	public static void main(String[] args) {
		Constructor o = new Constructor();
		o.i = 5;
		o.func();
		Constructor.inner u = o.new inner();
		u.f=1.2f;
		u.func1();

	}

}
