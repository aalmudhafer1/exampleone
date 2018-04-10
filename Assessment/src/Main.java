import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Adventure of Barron Moore");
		System.out.println("Type look to begin the game ");
		String begin = sc.nextLine();

		boolean valid = (begin.equals("look"));

		if (valid == true) {
			System.out.println("Game Started");
		}

		else {

			System.out.println("please enter look");
		}

		Player play = new Player();
		System.out.println(("you entered ") + play.playerMovement());
					
		Grid grid = new Grid();
		grid.printGrid(play);

		
		System.out.println(("you entered ") + play.playerMovement());
		grid.printGrid(play);
	}

}
