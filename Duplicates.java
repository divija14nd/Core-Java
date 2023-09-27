package corejava;

public class Duplicates {

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,3,3,4,5,5};
		int i;
		int numOfDuplicates = 0;
		
		for (i = 0; i < arr.length; i++) {
			for (int j = i+1; j < (arr.length); j++) {
				
				if (arr[i] == arr[j]) {
					numOfDuplicates += 1;
				}
			}
		}
		int newLength = arr.length - numOfDuplicates;
		System.out.println("Length of the New Array is "+ newLength);

	}

}

