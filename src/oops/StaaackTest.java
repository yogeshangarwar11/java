 package oops;

import java.util.*;

public class StaaackTest {

	public static void main(String[] args) {
		Stack<Integer> a = new Stack <Integer>();
		a.push(10);
		a.push(32);
		a.push(24);
		a.push(65);
		System.out.println(a);
		Stack<Integer> b = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 10 numbers : ");
		for (int i = 0;i<=10;i++) {
			int y = sc.nextInt();
			b.push(y);
		}
		System.out.println("entered values are : " + b);
		a.pop();//removed the last element
		System.out.println("Elements after pop method = " +a );//removes head value
		System.out.println("Elements after peek method = " +a.peek());//retrieves the head value and does not delete it
		Iterator <Integer> x = a.iterator();
		
		while(x.hasNext()) {
			System.out.print(x.next()+" ");
		}
		
	}

}
