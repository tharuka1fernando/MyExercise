package BasicPartII;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex163 {

	public static void main(String[] args) {

	//	long binary = convertDectoBinary(25);
	//	System.out.println(binary);
		
		int ctr =0;
		
		String binary = Integer.toBinaryString(25);
		System.out.println(binary);
		
		for(char ch:binary.toCharArray()) {
			ctr +=ch=='0'? 1:0;
			
			System.out.println(ctr);
		}
		
	//	return ctr;
	}
	//	Integer array1[] = { binary };

	//	System.out.println("Binary value is");
	//	System.out.println(Arrays.toString(array1));
	//	Arrays.sort(array1, Collections.reverseOrder());

	//	for (int i; i < array1.length; i++)
	//		System.out.println(array1[i] < 1);

	

	public static long convertDectoBinary(int num) {

		// Scanner input = new Scanner(System.in);
		// System.out.println("Eneter the value");
		// int num = input.nextInt();

		long binaryRep = 0;
		int reminder = 0;
		int i = 1;

		while (num != 0) {

			reminder = num % 2;
			num = num / 2;

			binaryRep += reminder * i;
			i *= 10;
		}

		return binaryRep;
	}

}
