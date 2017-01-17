
public class Car2Tester {

	public static void main(String[] args){
		Car2 myCar = new Car2();
		System.out.println("Color of my car: " + myCar.color);
		System.out.println("My car model: " + myCar.getCarModel());
		myCar.setCarModel("Toyota", "Camry");
		myCar.color = "red";
		System.out.println("New color: " + myCar.color);
		System.out.println("My car model: " + myCar.getCarModel());
		
		System.out.println("---------------------------------------------");
		Car2 yourCar = new Car2("grey");
		System.out.println("Color of your car: " + yourCar.color);
		System.out.println("Your car model: " + yourCar.getCarModel());
		yourCar.setCarModel("Honda", "Accord");
		System.out.println("Your new car model: " + yourCar.getCarModel());
		
		System.out.println("---------------------------------------------");
		Car2 friendCar = new Car2("white", "Toyota", "Corolla", 10000);
		System.out.println("Color of your friend's car: " + friendCar.color);
		System.out.println("Your friend's car mode: " + friendCar.getCarModel());
		System.out.println("Current mileage: " + friendCar.getMileage() + " km.");
		friendCar.drive(690);
		System.out.println("New mileage after drove to Chiang Mai: " + friendCar.getMileage() + " km.");
		
		System.out.println("---------------------------------------------");
		System.out.println("Total number of instances/objects of class Car = " + Car2.count);
		
	}
}
