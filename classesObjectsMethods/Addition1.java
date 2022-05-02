package classesObjectsMethods;

class Addition1 {
	public static void main(String[] args) {
		
		int x = 5;
		int y = 7;
		int z = sum(x, y);
		
		System.out.println(z);
	}
	static int sum(int a, int b) {
	
		int c = a + b;
		return c;
	}

}
