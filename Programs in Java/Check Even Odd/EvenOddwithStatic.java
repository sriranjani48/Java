
public class EvenOddwithStatic {
	
	public static String evenodd(int num) {
		if(num == 0) {
			System.out.println('0');
		}
		else if(num % 2 == 0){
			return("Even");
		}
		else if(num % 2 != 0){
			return("Odd");
		}
		return null;
	}

	public static void main(String[] args) {
		int num1 = 10;
		evenodd(num1);
	}

}
