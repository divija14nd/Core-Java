package corejava;

/*  Write a program to print all the LEADERS in the array. 
 * Note: An element is leader if it is greater than all the elements to its right side  */

public class LeaderElement {

	public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        int n = arr.length;
        int maxFromRight = arr[n - 1];

        System.out.print(maxFromRight + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        

	}

  }
}

