
public class EggStop2 {
	
	public EggStop2(){
		
	}
	
	/*
	 * print top of the egg
	 */
	public void printEggTop(){
		System.out.println(" --- ");
		System.out.println("/   \\");
	}
	
	/*
	 * print bottom of the egg
	 */
	public void printEggBottom(){
		System.out.println("\\   /");
		System.out.println(" ---");
	}
	
	/*
	 * print line
	 */
	public void printLine(){
		System.out.println("+---+");
	}
	
	public static void main(String[] args) {
		EggStop2 egg = new EggStop2();
		egg.printEggTop();
		egg.printEggBottom();
		egg.printLine();
		egg.printEggTop();
		System.out.println("|stop|");
		egg.printEggBottom();
		egg.printLine();
	}
}
