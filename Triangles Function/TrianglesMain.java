package corejava;

/*
 * A triangle is represented by its 3 sides such that the sum of any 
 * two sides is greater than the third. Write a class to represent a 
 * triangle given 3 sides and to find its perimeter and area. Area using 
 * Heron’s formula sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2. 
 * If the triangle is invalid, the perimeter and area must be -1. 
 * Read the 3 sides as input from the user and print the area and perimeter. 
 * Write methods isEquilateral(), isScalene() and isIsosceles(), isRightAngled() 
 * which will return true or false based on whether the triangle is equilateral, 
 * isosceles, scalene or right-angled.*/

public class TrianglesMain {

	public static void main(String[] args) {
		
		Triangles t1 = new Triangles();
		t1.side1 = 5;
		t1.side2 = 3;
		t1.side3 = 4;
		
		System.out.println("Triangle 1");
		System.out.println("Side 1: " + t1.side1);
		System.out.println("Side 2: " + t1.side2);
		System.out.println("Side 3: " + t1.side3);
		System.out.println("Perimeter of Triangle 1 is: " + t1.perimeter());
		System.out.println("Area of Triangle 1 is: " + t1.area());
		System.out.println("Is the triangle equilateral? " + t1.isEquilateral());
		System.out.println("Is the triangle isosceles? " + t1.isIsosceles());
		System.out.println("Is the triangle scalene? " + t1.isScalene());
		System.out.println("Is the triangle right angled? " + t1.isRightAngled());
		
		
		

	}

}
