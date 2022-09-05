package oops;

public class MultilevelInheritance2 extends MultilevelInheritance1{
	public void game() {
		System.out.println(r+z);
		System.out.println(i+z);
	}
	public static void main(String[] args) {
		MultilevelInheritance2 a = new MultilevelInheritance2();
		a.game();
		a.display(); 
		

	}

}
