package oops;

import java.util.Scanner;

public class EvenOddCase {
	public void evenOdd(int n) {
		if (n%2==0) {
			System.out.println(n + " is even number");
		}else {
			System.out.println(n + " is odd number");
		}
	}
	public void OddEven() {
		int n = 1;
		while (n<=10) {
			if(n%2 == 0) {
				System.out.println( n + " is even number");
			}
			if(n%2 == 1) {
				System.out.println(n + " is odd number");
			}
			n++;
		}
	}
	public void evenOrOdd(int n) {
		if(n%2 == 0)
			System.out.println(n + " is even number");
		else {
			System.out.println(n + " is odd number");
		}
	}
	
	public void arrayReverse(int arr[],int start,int end) {
		int temp;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}
	}
	public void array(int arr[]) {
		for (int x:arr) {
			System.out.print(" " + x);
		}
		System.out.println();
	}
	public void palindrome(int n) {
		int temp = n;
		int rem;
		int tot = 0;
		for (int i = 0;n>0;i++) {
			rem = n %10;
			tot = tot*10 + rem;
			n = n/10;
		}
		if (temp == tot)
			System.out.println(" it is palindrome");
		else {
			System.out.println("it is not palindrome");
		}
	}
	public static void main(String[] args) {
		EvenOddCase x = new EvenOddCase();
		x.evenOdd(12);
		x.evenOdd(23);
		int arr[] = {1,3,5,7,9,12};
		x.array(arr);
		x.arrayReverse(arr,0,5);
		System.out.println();
		x.array(arr);
		x.OddEven();
		Scanner sc = new Scanner(System.in);
		System.out.println("give any value");
 		int n = sc.nextInt();
		x.evenOrOdd(n);
		System.out.println("give any value to check for palindrome : ");
		x.palindrome(sc.nextInt());
		
		
		
		
	}
}
