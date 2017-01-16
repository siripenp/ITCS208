
public class CarExample {
	
	/*
	 *  public attribute
	 *  can be accessed by objectName.color from anywhere
	 */
	public String color;
	
	/*
	 *  private attributes: They only can be accessed within the same class.
	 *  They cannot be accessed via objectName.variableName from outside this file.
	 *  Therefore, we require setter and getter public methods to access these variables.
	 */
	private String brand;
	private String model;
	private int mileage;
	
	/*
	 *  static variable
	 */
	public static int count;	// to count number of objects that are instantiated 
	
	/*
	 * No-argument Constructor
	 */
	public CarExample(){
		
	}
	
	/*
	 * Paremeterized Constructor
	 */
	public CarExample(String aColor){
		
	}
	
	public CarExample(String aColor, String aBrand, String aModel, int km){
		
	}
	
	// set number of mileage
	public void setMileage(int km){
		
	}
	
	// get number of mileage
	public double getMileage(){
		return 0.0;
	}
	
	// update car model and brand
	public void setCarModel(String aBrand, String aModel){
	
	}
	
	// get BOTH brand name and model of the car
	// hint: return only one string by using '+' to combine multiple string together first
	// e.g., "Toyota" + "," + "Camry"
	public String getCarModel(){
		return "";
	}
	
	// add mileage when the car was driven, and return the new mileage
	public double drive(int km){
		return 0.0;
	}
	
	public void printAllData(){
		System.out.println("Car{color: " + color + ", brand: " + brand + ", model: " + model + ", mileage: " + "km}");
	}
}

