package corejava;


public class Triangles {

	double side1;
	double side2;
	double side3;
	
	public boolean isValid() {
		if (side1 + side2 > side3 || side2 + side3 > side1 || side1 + side3 > side2) {
			return true;
		}else 
			return false;
	}
	public double perimeter() {

		if (side1 + side2 > side3 || side2 + side3 > side1 || side1 + side3 > side2) {
			double res = side1 + side2 + side3;
			return res;
		}else 
			return -1;
	}
	
	public double area() {
		if (side1 + side2 > side3 || side2 + side3 > side1 || side1 + side3 > side2) {
			double s = (side1 + side2 + side3)/2;
			double res = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
			return res;
		}else 
			return -1;
				
	}
	
	public boolean isEquilateral() {
		if(side1 == side2 && side2 == side3) 
			return true;
		else 
			return false;
	}
	
	public boolean isIsosceles() {
		if(side1 == side2 || side2 == side3 || side1 == side3)
			return true;
		else
			return false;
	}
	
	public boolean isScalene() {
		if(side1 != side2 && side2 != side3 && side1 != side3)
			return true;
		else
			return false;
	}
	
	public boolean isRightAngled() {
		if( (Math.pow(side1, 2) == Math.pow(side2,2) + Math.pow(side3, 2)) || (Math.pow(side2, 2) == Math.pow(side1,2) + Math.pow(side3, 2)) || (Math.pow(side3, 2) == Math.pow(side2,2) + Math.pow(side1, 2))) {
			return true;
		}else
			return false;
	}
}
