package corejava;

public class Pattern {

	public static void main(String[] args) {
		int a = 5;
		
		for(a = 5; a > 0; a--)
		{
			 for (int b = 1; b <= a; b++) {
	                System.out.print("* ");
	            }
	            System.out.println();
		}
	}
}
