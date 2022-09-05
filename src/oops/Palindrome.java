package oops;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
	public void palin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please give any word to check whether it is palindrome : ");
		String name = sc.nextLine();
		char[] c = name.toCharArray();
		char[] u = new char[c.length]; 
		String reverse;
		int t = c.length;
		int count = 0;
		for(int i = t-1;i>=0;i--) {
			u[count]=c[i];
			count++;
		}
		System.out.println("is it polindrome ? " + Arrays.equals(c, u));
	}

	public static void main(String[] args) {
		Palindrome z = new Palindrome();
		z.palin();

	}

}
