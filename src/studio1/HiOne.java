package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for arg 0: ");
		String name = scan.next();
		//
		// Below this line, enter code so that this program's output says
		//      Hi, Pat.  How are you?
		// if the value of name is "Pat"
		//
		
		if (name == "Pat") {
			System.out.println("Hi " + name + ". How are you?");
		}
		scan.close();
		
	}

}
