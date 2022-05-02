package methods;

public class D {
	public static void main(String[] args) {
		C[] ob = new C[3];
		
		for(int i=0; i<3; i++) {
			ob[i] = new C();
			ob[i].get();
			ob[i].total();
			ob[i].show();
			
		}
	}

}
