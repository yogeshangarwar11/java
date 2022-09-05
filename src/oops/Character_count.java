package oops;

import java.util.Scanner;

public class Character_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name : ");
		String name = sc.nextLine();
		char[] c = name.toCharArray();
		int count = 0;
		for(int i=0; i < c.length;i++) {
			count++;
		} 
		if (count == 1) {
			System.out.println("only one character present in string ");
		}
		else {
			System.out.println("number of characters in string are : " + count);
		}

	}

}
