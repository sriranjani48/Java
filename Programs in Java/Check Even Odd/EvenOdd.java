
public class EvenOdd {
	
	public String evenodd(int num) {
		if(num == 0) {
			return null;
		}
		else if(num % 2 == 0){
			return("Even");
		}
		else if(num % 2 != 0){
			return("Odd");
		}
		return null;
	}
	
	public static void main(String args[]) {
		
		EvenOdd ob = new EvenOdd();
		
		int num1 = 10;
		ob.evenodd(num1);
		
		int num2 = 1111;
		ob.evenodd(num2);
		
		int num3 = 0;
		ob.evenodd(num3);
		
		int num4 = -10;
		ob.evenodd(num4);
		
		int num5 = ' ';
		ob.evenodd(num5);
	}
}
