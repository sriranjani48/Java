
public class Car extends Vehicle {
	public void run() {
		System.out.println("Car is running");
	}
	public void run(Car car) {
		super.run(car);
	}

}
