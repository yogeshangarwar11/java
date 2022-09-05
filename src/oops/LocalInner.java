package oops;

public class LocalInner {
	public int i;
	public int function() {
		class inner{
			int in;
			public int function1() {
				System.out.println("local inner class");
				return in+10;
				
			}
		}
		inner m = new inner();
		m.in = 10;
		return m.function1();	
	}

	public static void main(String[] args) {
		LocalInner c = new LocalInner();
		c.i = c.function();
		System.out.println(c.i);

	}

}
