import java.util.Scanner;


public class Player {
	
	int  x = 1;
	int  y = 1;
	

	public String playerMovement() {

		Scanner playerSC = new Scanner(System.in);

		System.out.println("please enter north, south, east or west");
		String userInput = playerSC.nextLine();

		if (userInput.equals("north")) {
			y = y - 1;
			return userInput;

		}

		if (userInput.equals("south")) {
			y = y + 1;
			return userInput;
		}

		if (userInput.equals("east")) {

			x = x + 1;

			return userInput;
		}

		if (userInput.equals("west")) {
			x = x - 1;
			return userInput;
		}
		return userInput;

	}

}
