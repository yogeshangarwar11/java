package oops;

public class AnonymousClass {

	public static void main(String[] args) {
		AbcInterface a = new AbcInterface() {
			
			@Override
			public void function() {
				System.out.println("you");
			}
		};
		
		Anonymous c = new Anonymous() {
			
			@Override
			public void function1() {
				System.out.println("ggg");
				
			}
		};
		a.function();
		c.function1();

	}

}
