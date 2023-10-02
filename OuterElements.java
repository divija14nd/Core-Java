package corejava;

/*  Write a program to display outer elements of a matrix.  */

public class OuterElements {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 5, 2, 6, 3, 1 }, 
						   { 7, 2, 0, 4, 6, 0 },
						   { 2, 7, 9, 9, 1, 9 },
						   { 0, 1, 1, 8, 8, 3 },
						   { 5, 0, 5, 6, 9, 8 }, 
						   { 5, 5, 4, 9, 7, 7 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == 0 || i == matrix.length - 1 || j == 0 || j == matrix[0].length - 1) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		System.out.println();
	}

}
