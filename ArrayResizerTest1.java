package apcsafrq.frq2021.question4;

public class ArrayResizerTest1 {
	public static void main(String[] args) {
		int[][] arr =  {{2, 1, 0},
						{1, 3, 2},
						{0, 0, 0},
						{4, 5, 6}};
		//false
		System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
		//true
		System.out.println(ArrayResizer.isNonZeroRow(arr, 1));
		//false
		System.out.println(ArrayResizer.isNonZeroRow(arr, 2));
		//true
		System.out.println(ArrayResizer.isNonZeroRow(arr, 3));
	}
}
