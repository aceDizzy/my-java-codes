package methods;

public class Methods {
	public static void main(String[] args) {
	
		Ob_pass_ret ob1=new Ob_pass_ret();
		Ob_pass_ret ob2=new Ob_pass_ret();
		
		ob1.get(5, 6);
		ob1.show();
		
		ob2.get(7, 8);
		ob2.show();
		
		ob1=ob1.update(ob2);
		ob1.show();
		ob2.show();
		
		System.out.println("\n"+ob1.x+"\t"+ob1.y);
	}

}
