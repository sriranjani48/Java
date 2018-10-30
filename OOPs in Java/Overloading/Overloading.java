
public class Overloading {
	public int add(int a, int b) {
		return a + b;
	}
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	public double add(double a, double b) {
		return a + b;
	}
	
	public static void main(String args[]) {
		Overloading ob = new Overloading();
		System.out.println(ob.add(10, 100));
		System.out.println(ob.add(5, 10, 15));
		System.out.println(ob.add(2.5, 5.5));
	}
}
