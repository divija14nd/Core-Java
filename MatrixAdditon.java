package corejava;

/*  Write a program to add two matrices and store sum in a third matrix.  */
public class MatrixAdditon {

	public static void main(String[] args) {

		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrix2 = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

		int rows = matrix1.length;
		int col = matrix1[0].length;

		int[][] matrix3 = new int[rows][col];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		System.out.println("Resultant Matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
