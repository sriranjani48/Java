
public class A {
	
	public void m() {
		System.out.println("Hello World!");
	}
	
	public void n() {
		this.m();
		//or only m();
	}

	public static void main(String[] args) {
		A ob = new A();
		ob.n();

	}

}
