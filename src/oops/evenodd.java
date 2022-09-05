package oops;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.print("odd numbers from 1 to 10 are  ");
		for (i=1;i<=10;i++)
		{
		if (i%2==0) {
			continue;
			}
		System.out.print(" "+i);
		}
		System.out.println();
		System.out.print("even numbers from 1 to 10 are  ");
		for (j=1;j<=10;j++) {
			if (j%2==1) {
				continue;
			}
			System.out.print(" "+j);		
		}
		

	}

}
