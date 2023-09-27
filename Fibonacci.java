package corejava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for ( int i = 2; i<n; i++) {
			int t = a+b;
			a=b;
			b=t;
			
		}
		System.out.println(b);
		sc.close();
	} 
	
	
	
	

}