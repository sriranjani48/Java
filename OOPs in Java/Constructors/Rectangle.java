
public class Rectangle {
	int length;
	int breadth;

	/*
	 * A default constructor Rectangle(){ } or as below
	 */
	Rectangle() {
		length = 5;
		breadth = 4;
	}

//parameterized constructor
	Rectangle(int l, int b) {
		length = l;
		breadth = b;

	}

	public void display() {
		System.out.println("Area = " + length * breadth);
	}

	public static void main(String args[]) {
		Rectangle ob1 = new Rectangle();
		Rectangle ob2 = new Rectangle(5, 10);
		// ob1.length = 10;
		// ob1.breadth = 15;
		ob1.display();
		ob2.display();

	}
}
