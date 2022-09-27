package oops;

public class Probality {

	public static void main(String[] args) {
		String arr[] = {"Red","Green","Yellow","Yellow","Green","Red","Yellow","Yellow","Red","Green"};
		double c1 = 0;
		double c2 = 0;
		double c3 = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == "Red") {
				c1++;
			}
			else if(arr[i] == "Yellow") {
				c2++;
			}
			else if(arr[i] == "Green") {
				c3++;
			}
		}
		System.out.println("probability of winning red is : " + c1/10 +" , probability of winning Yellow is :  "+ 
		c2/10 +" & probability of winning Green is :  " + c3/10 );
		int rand = (int) (Math.random() * 10 );
		System.out.println("the winner is : "+ arr[rand]);
	}
}
