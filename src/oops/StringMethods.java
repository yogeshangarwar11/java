package oops;

public class StringMethods {

	public static void main(String[] args) {
		String d = "Yogesh";
		System.out.println(d.charAt(0));
		System.out.println(d.concat(" is reading"));
		System.out.println("after concatenation string d is = " +  d);
		System.out.println("position of character Y in a string is " + d.indexOf("Y"));
		System.out.println("length of whole string " +  d.length());
		System.out.println("after replacing h character of string with a new string will be = " + d.replace('h', 'a'));
		System.out.println("string after particular position = " + d.substring(2));
		System.out.println("converting string to upper case = " + d.toUpperCase());
		System.out.println("converting string to lower case = " + d.toLowerCase());
		String c = "yogesh";
		System.out.println("two strings d,c  equal is " + d.equals(c));
		System.out.println("is string d empty? " + d.isEmpty());
		System.out.println("whether strings equal after ignoring cases ? " + d.equalsIgnoreCase(c));
		
		
		
		
		
		
		

	}

}
