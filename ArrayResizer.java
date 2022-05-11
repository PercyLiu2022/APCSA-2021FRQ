package apcsafrq.frq2021.question4;

public class ArrayResizer {
	/**
	 * @Returns true if and only if every value in row r of array2D is non-zero.
	 * @Precondition: r is a valid row index in array2D.
	 * @Postcondition: array2D is unchanged.
	 */
	public static boolean isNonZeroRow(int[][] array2D, int r) {
		/* to be implemented in part (a) */
		//行数：arr.length
		//列数：arr[0].length
		//for(int row = 0; row < arr.length; row++)
		//    for(int col = 0; col < arr[0].length; col++)
		for (int col = 0; col < array2D[0].length; col++) {
			if (array2D[r][col] == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns the number of rows in array2D that contain all non-zero values.
	 * Postcondition: array2D is unchanged.
	 */
	public static int numNonZeroRows(int[][] array2D) {
		int count = 0;
		for(int row = 0; row < array2D.length; row++) {
			if(isNonZeroRow(array2D, row)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * @Return a new, possibly smaller, two-dimensional array that contains only
	 * rows from array2D with no zeros, as described in part (b). 
	 * @Precondition: array2D contains at least one column and at least one row with no zeros.
	 * @Postcondition: array2D is unchanged.
	 */
	
	// 不同长度的数组copy数据
	// 不同数组应有自己的row & col
	// array2D is unchanged!!!
	public static int[][] resize(int[][] array2D) {
		/* to be implemented in part (b) */
		int[][] results = new int[numNonZeroRows(array2D)][array2D[0].length];
		int rowForResults = 0;
		
		for(int row = 0; row < array2D.length; row++) {
			if(isNonZeroRow(array2D, row)) {
				for(int col = 0; col < array2D[0].length; col++) {
					results[rowForResults][col] = array2D[row][col];
				}
				rowForResults++;
			}
		}
		
		return results;
	}
}
