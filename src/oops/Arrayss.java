package oops;

public class Arrayss {

	public static void main(String[] args) {
		String a[] = new String[7];
		a[0] = "yogesh";
		a[1] = "naresh";
		a[2] = "shiva";
		a[3] = "naidu";
		a[4] = "pandu";
		a[5] = "neem";  //array index out of bound exception as data elements exceeding array size
		//System.out.println(a[]);
		//System.out.println();	
	  for(int i = 0;i<=a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
