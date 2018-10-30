
public class Student {
	int rollno;
	String name;
	Address addr;
	
	public void display() {
		System.out.println(rollno+" "+name);
		System.out.println(addr.city+" "+addr.country+" "+addr.code);
	}
}
