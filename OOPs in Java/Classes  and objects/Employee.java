//class - type
//Employee - class name
public class Employee {
	// int, String - primitive type
	int id; //instance variables
	
	String name; //instance variables
	
	String companyName; //instance variables
	
	
	 String country; 
	 String country1 = "India";
	//static is associated with class not instance of the class
	 static String country2; //static variables
	
	public void display() {
		System.out.println(id+" "+name+" "+companyName+" "+country+" "+country1+" "+country2);
	}
	
	public static void main(String args[]) {
		//object emp1, emp2 creation of type Employee
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		Employee.country2 = "Canada";
		//Employee.display();
		emp1.display();
		emp2.display();
		
		emp1.id = 111;
		emp1.name = "Sri";
		emp1.companyName = "ABC";
		
		emp2.id = 222;
		emp2.name = "Ranj";
		emp2.companyName = "XYZ";
		
		emp1.display();
		emp2.display();
		
		
		emp1.country = "USA";
		emp1.display();
		emp2.display();
		
		emp1.country2 = "Australia";
		emp1.display();
		emp2.display();
	}
	
	
}
