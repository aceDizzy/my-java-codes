package classesObjectsMethods;

class Main{
	public static void main(String[] args) {
	
		StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();
		
		System.out.println("s1 values:");
		System.out.println("a =" +s1.getA() + ", b =" + s2.getB());
	// Static vs non-static variables
		System.out.println("s2 values:");
		System.out.println("a =" +s2.getA() + ", b =" + s2.getB());
		
	
		s1.setA(5);
		s1.setB(3);
		
		System.out.println("\ns1 values:");
		System.out.println("a =" +s1.getA() + ", b =" + s2.getB());
	
		System.out.println("s2 values:");
		System.out.println("a =" +s2.getA() + ", b =" + s2.getB());
		
	}
}
