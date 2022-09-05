package oops;

public class SingleInheritance2 extends SingleInheritance {
		
	public void display() {
		System.out.println(t+y);
		//System.out.println("x=10000");
	}

	public static void main(String[] args) {
		SingleInheritance2 a = new SingleInheritance2();
		a.display(); 
		a.methodOne();
		//display();
		
		

	}

}
