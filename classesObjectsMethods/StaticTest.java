package classesObjectsMethods;

class StaticTest {
	private static int a;
	private int b;
	public StaticTest() {
		a = 0;
		b = 0;
	}
	
	//Accessors
	public static int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	//Mutators
	public static void setA(int newA) {
		a = newA;
	}
	public void setB(int newB) {
		b = newB;
	}
}
