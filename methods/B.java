package methods;

public class B {
	public static void main(String[] args) {
	
		A ob1 = new A();
		A ob2 = new A();
		
		ob1.get(99, "C++ Programming", 1350);
		ob2.get(83, "Java Programming", 1583);
		
		ob1.show();
		ob2.show();
		
		System.out.println("\nMore expensive book is");
		
		if(ob1.pricing() > ob2.pricing())
			ob1.show();
		else
			ob2.show();
	}

}
