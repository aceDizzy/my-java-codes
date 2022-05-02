package methods;

class Ob_pass_ret {
	
	public int x,y;
	public void get(int a, int b) {
		x=a;
		y=b;
	}
	
	public Ob_pass_ret update(Ob_pass_ret obj) {
		obj.x+=10;
		obj.y+=10;
		Ob_pass_ret temp = new Ob_pass_ret();
		temp.x=obj.x+this.x;
		temp.y=obj.y+this.y;
		return temp;
	}
	
	public void show() {
		System.out.println(x+"\t"+y);
	}
	

}
