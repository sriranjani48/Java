
public class Calculation {
	int point = 0;//instance variable
	static int count = 0;//static variable
	//constructor
	Calculation(){
		point++;
		count++;
		System.out.println(point);//value always = 1
		System.out.println(count);
	}

	//static method
	public static void Display() {
		//point++; - can't use non-static variable inside static method
		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {
		Calculation c1 = new Calculation();
		c1.Display();
		
		Calculation c2 = new Calculation();
		c2.Display();
		
		Calculation c3 = new Calculation();
		c3.Display();
		
		Calculation.Display();
		
		
		
				
	}
}
