package corejava;

/* Write a program to find sum of diagonal elements of a matrix  */


public class DiagonalMatrix {

	public static void main(String[] args) {
		
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 6, 8, 9 } };
		int res1 = 0;
		int res2 = 0;
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				if ( i == j) {
					res1 += matrix1[i][j];
				}
			}
		}
		
		for (int i = matrix1.length-1; i >= 0; i--) {
			for (int j = matrix1[i].length -1; j >= 0 ; j--) {
				if ( i + j == (matrix1.length - 1)) {
					res2 += matrix1[i][j];
				}
			}
		}
		
		System.out.println("Sum of Diagonal 1 from top left to bottom right of the matrix is: " + res1 );
		System.out.println("Sum of Diagonal 2 from top right to bottom left of the matrix is: " + res2 );
	}

}
