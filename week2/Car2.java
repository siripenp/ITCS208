
public class Car2 {
	
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
	private double mileage;
	
	/*
	 *  static variable
	 */
	public static int count = 0;
	
	/*
	 * No-argument Constructor
	 */
	public Car2(){
		// can have any code in the body, 
		// unlike 'Default Constructor' where the body does nothing
		System.out.println("This is a no-argument constructor for class 'car'");
		color = "black";
		brand = "";
		model = "";
		mileage = 0;
		count++;
	}
	
	/*
	 * Paremeterized Constructor
	 */
	public Car2(String aColor){
		// parse a variable color and assign it to the attribute 'carColor'
		color = aColor;
		brand = "";
		model = "";
		mileage = 0;
		count++;
	}
	
	public Car2(String aColor, String aBrand, String aModel, int km){
		// parse a variable color and assign it to the attribute 'carColor'
		color = aColor;
		brand = aBrand;
		model = aModel;
		mileage = km;
		count++;
	}
	
	// set number of mileage
	public void setMileage(int km){
		mileage = km;
	}
	
	// get number of mileage
	public double getMileage(){
		return mileage;
	}
	
	// update car model and brand
	public void setCarModel(String aBrand, String aModel){
		brand = aBrand;
		model = aModel;
	}
	
	// get both brand name and model of the car
	public String getCarModel(){
		return brand + ", " + model;
	}
	
	// add mileage when the car was driven, and return the new mileage
	public double drive(int km){
		mileage = mileage + km;
		return mileage;
	}
}
