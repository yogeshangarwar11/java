package oops;

public class String1 {

	public static void main(String[] args) {
		String y = "Yogesh";
		String s = "Yogesh";
		String r = new String("Yogesh");
		char t[] = {'n','e','w' };
		String u = new String(t);
		System.out.println(y);
		System.out.println(s);
		System.out.println(r);
		System.out.println(t);
		System.out.println(u);
		System.out.println(y.toUpperCase());            //converting overall string into upper case letter string 
		System.out.println(y.toLowerCase());            //converting overall string into lower case letter string 
		String q = " Giri ";
		System.out.println(q);
		System.out.println(q.trim());                   //removing white spaces from both ends of a string
		System.out.println(q.startsWith(" Gi"));        //checking whether string starts with these characters
		System.out.println(q.endsWith("ri "));          //checking whether string ends with these characters
		System.out.println(q.charAt(1));                //printing particular character at particular position 
		System.out.println(q.length());                 //knowing the length of a string
		String e = r.intern();                          //creating an copy of a string object in the heap memory and storing it in the string constant pool
		System.out.println(e);
		int a = 122;
		String o = String.valueOf(a);                   //converting different types of values into string
		System.out.println(a+12);                       //concatenation of value which has made string to value
		String a1 = "my city green city";
		String a2 = a1.replace("my", "your");           //replacing particular characters with other characters
		System.out.println(a2);
		System.out.println(a1);
		System.out.println(y.equals(q));
		System.out.println(y.equals(s));
		String f = "";
		System.out.println(y.isEmpty());
		System.out.println(f.isEmpty());
		System.out.println(y.equalsIgnoreCase(s));      //comparing two strings ignoring lower and upper case differences
		String k = "YOGESH";
		System.out.println(y.equalsIgnoreCase(k));
		String A = "Giri is a good guy";
		//splitting at every white space
		for(String A1:A.split("\\s")) {
		System.out.println(A1);
		}
		//no splitting takes place here as 1 is mentioned
		for(String A1:A.split("\\s",1)) {
			System.out.println(A1);
			}
		//total string splitting in two lines
		for(String A1:A.split("\\s",2)) {
			System.out.println(A1);
			}
		//checking whether string containing a sequence of character
		System.out.println(A.contains("Giri"));
		//printing substring
		System.out.println("substring starting from 6th place :" + A.substring(5));
		System.out.println("substring starting from 6th place to 14th place :" + A.substring(5,14));
		System.out.println(A.compareTo(q));               //comparing word values
		String h = q.concat("is a myyfdaertyc ");         //addition string
		System.out.println(h);
		
		
		
		
	}
}
