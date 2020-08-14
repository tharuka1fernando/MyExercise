package BasicPartII;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex155 {

	public static void main(String[] args) {

		 int[][] input= {{10,20,30},{40,50,60}};
		 int[][] output = changeArray(input);

		 System.out.println(Arrays.deepToString(input));
		 System.out.println(Arrays.deepToString(output));
	}

	public static int[][] changeArray(int input[][]) {		
		int rows_length = input.length;
		int columns_length = input[0].length;		
		int[][] output = new int[columns_length][rows_length];
		
		
		for(int i=0;i<rows_length;i++) {
			for(int j=0;j<columns_length;j++) {
				output[j][i] = input[i][j];
				
			}
		}
		
		return output;
	}

}
