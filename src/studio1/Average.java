package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value for n1: ");
		int n1 = scan.nextInt();
		System.out.print("Enter value for n2: ");
		int n2 = scan.nextInt();
		
		double average = (double) (n1 + n2)/2; //or 2.0
		
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average + ".");
	}

}
