
public class EggStop {
	/*
	 * Question:
	 * What will happen if you remove 'static' keyword in the methods?
	 */
	
	/*
	 * print top of the egg
	 */
	public static void printEggTop(){
		System.out.println(" --- ");
		System.out.println("/   \\");
	}
	
	/*
	 * print bottom of the egg
	 */
	public static  void printEggBottom(){
		System.out.println("\\   /");
		System.out.println(" ---");
	}
	
	/*
	 * print line
	 */
	public static void printLine(){
		System.out.println("+---+");
	}
	
	public static void main(String[] args) {
		printEggTop();
		printEggBottom();
		printLine();
		printEggTop();
		System.out.println("|stop|");
		printEggBottom();
		printLine();
	}
	

}
