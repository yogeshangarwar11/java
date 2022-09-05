package oops;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ScannerExample {

	
		public static void main (String[] args)
		{
		    Scanner input = new Scanner(System.in);
		    double[] numbers = new double[5];

		    for (int i = 0; i < numbers.length; i++)
		    {
		        System.out.println("Please enter number ");
		        numbers[i] = input.nextDouble();
		        //System.out.println("your number is " +numbers[i]);
		    }
		    System.out.print("entered numbers are  ");
		     for (int j = 0; j < numbers.length; j++)
		    {
		    	System.out.print(numbers[j]+" ,");
		    }
		     System.out.println();
		     System.out.println("the sum of first two no.s " +numbers[0]*numbers[1]);
		    
		}

		
	}


