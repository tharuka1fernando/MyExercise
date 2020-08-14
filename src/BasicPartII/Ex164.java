package BasicPartII;

import java.util.Scanner;

public class Ex164 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input the number to divide");
		int num1 = input.nextInt();
		System.out.println("Input the divider");
		int num2 = input.nextInt();

		double result = num1 / num2;

		System.out.println("The answer is " + result);

		input.close();

	}

}
