package BasicPartII;

import java.util.Arrays;
//import java.util.Collections;

public class Ex160 {

	public static void main(String[] args) {

		Integer array1[] = { 1, 4, 17, 7, 25, 3, 100 };

		int k = 3;

		System.out.println("3 Smallest elements of the array");
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array1);
		//Arrays.sort(array1, Collections.reverseOrder());

		for (int i = 0; i < k; i++)
			System.out.print(array1[i] + " ");
	}

}
