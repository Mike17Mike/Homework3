package HW3.CS3310;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stacks instructionList = new Stacks();
		String instruction = "";
		boolean start = false;
		
		while((instruction.compareTo("!") != 0)) {   //This will start a loop that will only terminate if the user specifies a !
			instruction = in.next();
			if(instruction.compareTo("?") == 0) {
				//Call the method to print out all of the web pages in the top of the query stack
				System.out.println("Help?");
			}
			else if(instruction.compareTo("&&") == 0) {
				//Call the method to and the last two operands in the query stack
				System.out.println("Wow  &&");
			}
			else if(instruction.compareTo("||") == 0) {
				//Call the method to or the last two operands in the query stack
				System.out.println("boo");
			}
			else {
				//Call the method to validate it is a key
				instructionList.push(instruction);
			}
		}
	}

}
