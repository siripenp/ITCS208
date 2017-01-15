
public class HelloUser {

	/*
	 * To understand args parameter in main method
	 * try to run this following commands on the command line window (cmd)
	 * > java HelloUser
	 * > java HelloUser Student
	 * > java HelloUser Awesome Student
	 * > java HelloUser "Awesome Student"
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello " + args[0]);
		
	}

}
