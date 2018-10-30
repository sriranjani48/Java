//Child or derived class
//Example for single Inheritance
public class Cat extends Animal{
	public void makeSound() {
		System.out.println(animalCount);
		System.out.println("Meaw");
	}
	
		
	public static void main(String[] args) {
		Cat sound = new Cat();
		sound.makeSound();
	}

}
