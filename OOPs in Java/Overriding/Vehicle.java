
public class Vehicle {
	public void run() {
		System.out.println("Vehicle is running");
	}
	public void run(Vehicle vehicle) {
		System.out.println(vehicle.getClass());
	}
}
