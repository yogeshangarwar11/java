package oops;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		long x = System.currentTimeMillis();//returning current system time in milli-seconds to variable x
		StringBuffer a = new StringBuffer();
		for (int i = 0;i<10000;i++) {
			a.append("is wise man");
			
		}
		System.out.println("time taken by the string buffer :" + (System.currentTimeMillis()-x) + "ms");
		long y = System.currentTimeMillis();//returning current system time in milli-seconds to variable y
		StringBuilder b = new StringBuilder();
		for (int i = 0;i<10000;i++) {
			b.append("is wise man");
			
		}
		System.out.println("time taken by the string builder :" + (System.currentTimeMillis()-y) + "ms");
		
	}

}
