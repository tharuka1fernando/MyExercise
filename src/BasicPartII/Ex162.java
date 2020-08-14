package BasicPartII;

import java.util.Arrays;

public class Ex162 {

	public static void main(String[] args) {

		Integer array1[] = { 1, 4, 17, 7, 25, 3, 100 };

		int sum = 0;

		System.out.println("Original Array:");
		System.out.println(Arrays.toString(array1));

		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}

		double ave = sum / array1.length;

		System.out.println("The average of the array " + ave);
		System.out.println("The numbers of the array " + array1.length);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > ave) {
				System.out.println(array1[i]);
			}
		}

	}

}
