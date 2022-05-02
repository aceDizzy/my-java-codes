package classesObjectsMethods;

class circle1 {
	public static void main(String[] a) {
		
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(12);
		
		System.out.println("c1 Area is " +c1.getArea());
		System.out.println("c2 Diameter is "+c2.getDiameter());
		
	//	Circle c1 = new Circle(10);
		System.out.println("c1 Area is " +c1.getArea());
		c1.radius = 15;
		System.out.println("c1 Area is now " +c1.getArea());
	}

}
