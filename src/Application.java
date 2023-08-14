
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.isMotorised = true;
		car1.wheels = 4;
		car1.brand = "Volvo";
		
		Bicycle bike1 = new Bicycle();
		bike1.isMotorised = false;
		bike1.wheels = 2;
		bike1.brand = "Gazelle";
		
		Motorbike motorBike1 = new Motorbike();
		motorBike1.isMotorised = true;
		motorBike1.wheels = 2;
		motorBike1.brand = "Yamaha";

		Tricycle tricycle1 = new Tricycle();
		tricycle1.isMotorised = false;
		tricycle1.wheels = 2;
		tricycle1.brand = "Fisher Price";
		
		car1.startVoertuig();
		car1.makeSound();
		
		bike1.startVoertuig();
		bike1.makeSound();
		
		motorBike1.startVoertuig();
		motorBike1.makeSound();
		
		
		tricycle1.startVoertuig();
		tricycle1.makeSound();
		
	}

}
