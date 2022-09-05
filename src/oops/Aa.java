package oops;

public class Aa {
	int x = 2;//non static var
	double r = 9.9;
	static int v = 35;//static var

	public static void main(String[] args) {
		Aa a = new Aa();
		System.out.println(a.x+a.r);
		System.out.println(a.r);
		System.out.println(v);
		
		

	}

}
