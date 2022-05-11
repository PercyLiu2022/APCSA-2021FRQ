package apcsafrq.frq2021.question4;

import java.util.Arrays;

public class ArrayResizerTest2 {
	public static void main(String[] args) {
		int[][] arr =  {{2, 1, 0},
				    	{1, 3, 2},
				    	{0, 0, 0},
				    	{4, 5, 6}};
		
		int rows = ArrayResizer.numNonZeroRows(arr);
		
		System.out.println(" 非零行一共多少 "+rows);
		
	}
}
