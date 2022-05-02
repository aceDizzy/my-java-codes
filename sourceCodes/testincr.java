package sourceCodes;

/*public class testincr {
	public static void main(String[] args) {
		int i = 0;
		i = i++ + i;
		System.out.println("I = " + i);
	}

}

public class testincr {
	static int i = 1;
	public static void main(String[] args) {
		System.out.println(i+",");
		m(i);
		System.out.println(i);
	}
	public static void m(int i) {
		i += 2;
	}
}



public class testincr {
	public static void main(String[] args) {
		System.out.println("Hello,\nworld!");
	}
}
*/
public class testincr{
public static int foo(int a, String s) {
	s = "Yellow";
	a = a+2;
	return a;
}
public static void bar() {
	int a = 3;
	String s = "Blue";
	a = foo(a,s);
	System.out.println("a="+a+" s="+s);
}
public static void main(String args[]) {
	bar();
}
}

