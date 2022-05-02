package methods;

class A {

	int b_id, price;
	String b_name;
	
	void get(int id, String name, int p) {
		b_id = id;
		b_name = name;
		price = p;
	}
	
	void show() {
		System.out.println("Book ID: "+b_id);
		System.out.println("Book Name: "+b_name);
		System.out.println("Book Price: "+price);
		System.out.println("\n"); //important, spaces!
	}
	
	int pricing() {
		return(price);
	}

}
