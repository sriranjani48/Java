//we can't create instance of Student class from outside the class(i.e. we cant't create in TestStudent class.). 
package testing;

public class Student {
	int rollno;
	String name;
	//private constructor
	 private Student(int srollno, String sname) {
		rollno = srollno;
		name = sname;
	}
	public void print() {
		System.out.println(rollno+","+name);
	}
	public static void main(String[] args) {
		Student student = new Student(111, "Sri");
		Student anotherStudent = new Student(222, "Ranjani");
		student.print();
		anotherStudent.print();
	}
}
