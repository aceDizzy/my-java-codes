package classesObjectsMethods;

class Circle {
	//Radius is enough to determine all circle attributes
	public double radius;
	
	//Constructor
	public Circle(double r) {
		radius = r;
	}
	
	//Methods
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return(radius*radius) * Math.PI;
	}
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	public double getDiameter() {
		return radius*2;
	}

}
