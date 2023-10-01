package corejava;

/*  Write a program to find the maximum element in a matrix.  */

public class MaxMatrixElement {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3}, {2,3,4}, {4,5,6}};
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
		}
		System.out.println("Maximum element in the matrix is: " + max);
	}

}
