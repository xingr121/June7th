package class1p;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number: ");
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		System.out.println("The first number is " + x);
		System.out.println("Enter the second number: ");
		int y = kb.nextInt();
		System.out.println("The second number is " + y);
		int z = x + y;
		System.out.println("The sum of these two numbers is: " + z);
		
	}

}
