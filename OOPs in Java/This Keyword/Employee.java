//if parameters, instance variables are same.
//To distinguish b/w instance variables and parameters, we use this keyword
public class Employee {
	int id;
	String name;
	int salary;
	
	/*parameters and instance variables are same
	 * Employee(int id, String name, int salary){
		id = id;
		name = name;
		salary = salary;
	}*/ // output 0 null 0
	
	//using this keyword
	Employee(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	/*or you can change parameters as below
	 * Employee(int i, String n, int s){
		id = i;
		name = n;
		salary = s;
	}*/
	
	
	public void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
	public static void main(String args[]) {
		Employee emp = new Employee(1, "Sri", 10000);
		emp.display();
	}
}
