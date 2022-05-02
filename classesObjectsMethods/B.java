package classesObjectsMethods;

class B {
	public static void main(String[] args) {
		A a = new A();
	//	System.out.println(a.value); //Error, value is private
		a.setValue(33); // Changes the value by mutator method
		System.out.println(a.getValue()); //prints 33
	}

}
