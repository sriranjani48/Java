//Constuctor Overloading

public class Student {
	int rollno;
	String name;
	int age;
	static String college = "ABC";
	Student(int r, String n){
		rollno = r;
		name = n;
	}
	Student(int r, String n, int a){
		rollno = r;
		name = n;
		age = a;
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+age+" "+college);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(111, "Sri");
		Student s2 = new Student(222, "Sri", 20);
		s1.display();
		s2.display();

	}

}
