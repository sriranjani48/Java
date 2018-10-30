
public class Staff {
	int id;
	String designation;
	Address addr;
	
	public void display() {
		System.out.println(id+" "+designation);
		System.out.println(addr.city+" "+addr.country+" "+addr.code);
	}
}
