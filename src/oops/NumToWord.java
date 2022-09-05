package oops;

import java.util.Scanner;

public class NumToWord {
	public   void numword(int n) {
	int units;
	int tens;
	int hundreds;
	int thousands;
	if (n<0 || n> 9999) {
		System.out.println("wrong number");
	}else {
		units = n%10;;
		int ut = n/10;
		tens = ut%10;
		int tt = ut/10;
		hundreds = tt%10;
		thousands = n/1000;
		String [] u = {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
				"twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
		String [] t = {" ","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	    String h = "hundred";
	    String tr = "thousand";
	    if (n<=20) {
	    	System.out.println(u[n]);
		}
	    else if (n>20 && n<100) {
			System.out.println(t[tens]+u[units]+" ");
		}
		else if (n<1000) {
			System.out.println(u[hundreds]+h+t[tens]+u[units]+" ");
		}
		else {
			System.out.println(u[thousands]+" "+tr+" "+u[hundreds]+" "+h+" "+t[tens]+" " +u[units]+" ");
		}
	}
	}
	public static void main(String[] args) {
		NumToWord x = new NumToWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any value form 0 to 9999");
		int n = sc.nextInt();
		x.numword(n);
	}
	
}
