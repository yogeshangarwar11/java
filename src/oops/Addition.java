package oops;

public class Addition {
	int x = 20;
	double y = 20.664;
	float c = 29.8f;
	public void add() {
		System.out.println("sum of x+y = " + (x+y));
	}
	
 public static void main(String[] args) {
	 Addition r = new Addition();	
	 r.add();
	 float g = r.c-r.x;
	 System.out.println(g);
	 int t = (int)r.c-r.x;
	 System.out.println("after explicit casting value will be  " + t);
	 
	}
 
}



