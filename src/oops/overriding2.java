package oops;

public class overriding2 extends overriding1 {
	//public void tap(){
		//System.out.println("this is very tough");
		
	//}
	public void tap() {
		System.out.println("this is very simple");
	}
		

	public static void main(String[] args) {
		overriding1 a = new overriding2();   //Upcasting
		a.tap();
		overriding1 b = new overriding2();
		b.tap();
		

	}

}
