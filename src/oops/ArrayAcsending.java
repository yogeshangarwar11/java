package oops;

import java.util.Arrays;

public class ArrayAcsending {

	public static void main(String[] args) {
		int a[] = new int[] {3,1,4,5,8,4};
		int b = 0;
		System.out.print("Elements of array before ascending order are ");
		for (int i= 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0;i<a.length;i++) {
			for (int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		System.out.println();
		System.out.print("Elements of array after ascending order are ");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		for (int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					b = a[j];
					a[j] = a[i];
					a[i] = b;
				}
			}
		}
		System.out.println();
		System.out.print("Elements of array after descending order are ");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		System.out.println();
		System.out.println("The highest number in an array is : " + a[4] );
		//simple way of sorting using sort method
		Arrays.sort(a);
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i = a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
		System.out.println();
		String d = "yogeshyhh";
		char[] c = d.toCharArray(); 
		System.out.println(c);
		int maxcount = 0;
		char mostrepeated = 0;
		for (int i = 0;i < c.length;i++) {
			int count = 0;
			for(int j = 0;j<c.length;j++) {
				if(c[i] == c[j]) {
				count++;
				}
			}
			if (count > maxcount) {
				maxcount = count;
				mostrepeated = c[i];
			}
	
		}
		System.out.println("most repeated word is :" + mostrepeated);
		String d1 = "yogesh";
		String d2 = "dhananjay";
		String d3 = "giri";
		String d4 = d1.concat(d2).concat(d3);
		char[] c1 = d4.toCharArray(); 
		int maxcount1 = 0;
		char mostrepeated1 = 0;
		for (int i = 0;i < c1.length;i++) {
			int count1 = 0;
			for(int j = 0;j<c1.length;j++) {
				if(c1[i] == c1[j]) {
				count1++;
				}
			}
			if (count1 > maxcount1) {
				maxcount1 = count1;
				mostrepeated1 = c1[i];
			}
	
		}
		System.out.println("most repeted is : " + mostrepeated1);
	}

}
