package apcsafrq.frq2021.question4;

import java.util.Arrays;

public class ArrayResizerTest3 {
	public static void main(String[] args) {
		int[][] arr =  {{2, 1, 0},
				    	{1, 3, 2},
				    	{0, 0, 0},
				    	{4, 5, 6}};
		
		int[][] smaller = ArrayResizer.resize(arr);
		
		System.out.println(Arrays.toString(smaller[0]));
		System.out.println(Arrays.toString(smaller[1]));
		
	}
}
