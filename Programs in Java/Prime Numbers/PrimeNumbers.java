
public class PrimeNumbers {
	
	public static int prime(int num) { 
		int count;
		if(num <= 1) {
			return num;
		}
		else {
			for(int i = 2; i <= num; i++) {
				count = 0;
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						count++;
						break;
					}
					
				}
				if(count == 0) {
					System.out.print(i + " ");
					
				}
				
			}
			
		}
		System.out.print("\n");
		return 0;
	}
	
	public static void main(String[] args) {
		prime(10);
		prime(20);
		prime(100);

	}

}
