package BasicPartII;

import java.util.Arrays;
import java.util.Collections;

public class Ex159 {

	public static void main(String[] args) {

		Integer oriArra[] = { 1, 4, 17, 7, 25, 3, 100 };

		int k = 3;

		System.out.println(Arrays.toString(oriArra));

		Arrays.sort(oriArra, Collections.reverseOrder());

		for (int i = 0; i < k; i++)
			System.out.print(oriArra[i] + " ");
	}

}
