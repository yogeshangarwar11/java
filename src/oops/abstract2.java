package oops;

public class abstract2 extends abstract1{
	int run(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
		

	@Override
	void sing() {
		// TODO Auto-generated method stub
		System.out.print("is");
		
	}

	@Override
	void smile() {
		// TODO Auto-generated method stub
		System.out.print("good");
	}
	
	

	public static void main(String[] args) {	
		abstract2 T = new abstract2();
		System.out.println(T.run(10,20)) ;
		T.sing();
		T.smile();
	}

	
		
}
