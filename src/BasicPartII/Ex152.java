package BasicPartII;

import java.util.Scanner;

public class Ex152 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = input.nextInt();
		System.out.println("Enter the second number");
		int num2 = input.nextInt();
		System.out.println("Enter the thirsd number");
		int num3 = input.nextInt();
		System.out.println("Enter the fourth number");
		int num4 = input.nextInt();

		if (num1 == num2 && num2 == num3 && num3 == num4) {
			System.out.println("Numbers are equal");
		} else
			System.out.println("Numbers are not equal");
	input.close();
	}

}
