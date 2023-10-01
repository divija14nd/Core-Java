package corejava;

/*  Write a program to perform matrix multiplication and store product in a third matrix.  */

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrix2 = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		int rows2 = matrix2.length;
		int cols2 = matrix2[0].length;

		
		if (cols1 != rows2) {
			System.out.println("Matrix multiplication is not possible.");
			return;
		}

		
		int[][] matrix3 = new int[rows1][cols2];


		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) {
					matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		
		System.out.println("Resultant Matrix of Matrix multipllication:");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
