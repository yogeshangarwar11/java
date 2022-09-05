package oops;

public class array {

	public static void main(String[] args) {
		String x[]= new String[6];
		x[0] = "Y";
		x[1] = "O";
		x[2] = "G";
		x[3] = "E";
		x[4] = "S";
		x[5] = "H";
		System.out.print("array elements are = ");
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]);
		}
		System.out.println();
		System.out.print("reverse array elements are = ");
		for(int i=x.length-1;i>=0;i--) {
			System.out.print(x[i]);
		}
		
	}

}
