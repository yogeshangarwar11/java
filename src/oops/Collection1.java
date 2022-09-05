package oops;
 import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Collection1 {


public static void main(String[] args) { 
	 ArrayList<Integer> a = new ArrayList<Integer>();
	 Scanner sc = new Scanner(System.in); 
	 int y ;
System.out.println("enter 5 numbers to the list"); 
for(int i = 0;i<=4;i++) {
        a.add(sc.nextInt()); 
   } 
System.out.println("you have entered these values " +a); 
int [] q = new int[a.size()];
//int [] e = a.toArray();//only possible for strings
for(int i=0;i<q.length;i++) {
//System.out.println("elements stored in array q are " + (q[i])); 
}

  
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
           
        Object[] m = al.toArray();
  
        // Printing array of objects
        for (Object r : m) 
            System.out.print(r + " ");}
       
        public static void fun1(int arr[]) {
       	 ArrayList<Integer> array_list = new ArrayList<Integer>();
       	 for(int i=0;i<arr.length;i++)
       		 array_list.add(new Integer(arr[i]));
       	 System.out.println(array_list);
       	 
        int array[]= {1,2,3,4};
        fun1(array);
    }

}
