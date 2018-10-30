
public class Person {
	String name;
	int age;
	static String country = "India";
	
	Person(String n, int a){
		name = n;
		age = a;
	}
	
	public void display() {
		System.out.println(name+" "+age+" "+country);
	}
	
	public static void main(String args[]) {
		Person p1 = new Person("Sri", 20);	
		p1.display();
		
		Person p2 = new Person("ranjani", 15);
		p2.display();
		
		Person.country = "Canada";
		p1.display();
		p2.display();
		
		p1.name = "mmmm";		
	}
}
// compare p1 and p2 are equal
//