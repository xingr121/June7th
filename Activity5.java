package class1p;

import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number: ");
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		System.out.println("The first number is " + x);
		System.out.println("Enter the second number: ");
		int y = kb.nextInt();
		System.out.println("The second number is " + y);
		System.out.println("Enter the third number: ");
		int z = kb.nextInt();
		System.out.println("The third number is " + y);
		int sum = x + y + z;
		System.out.println("The sum of these three numbers is: " + sum);

	}

}
