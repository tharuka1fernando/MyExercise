package BasicPartII;

import java.util.Arrays;
import java.util.Collections;

public class Ex161 {

	public static void main(String[] args) {

		Integer array1[] = { 1, 4, 17, 7, 25, 3, 100 };

		int k = 2;

		System.out.println("Original Array");
		System.out.println(Arrays.toString(array1));
		System.out.println("Second smallest value of the array");
		Arrays.sort(array1);
		System.out.println(array1[k - 1] + " ");

		System.out.println("Second Largest value of the array");
		Arrays.sort(array1, Collections.reverseOrder());

		System.out.println(array1[k-1] + " ");

	}

}
