
public class Grid {

	int[][] gameArray = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 } };

	public void printGrid(Player play) {

		System.out.println("game grid");

		for (int row = 0; row < gameArray.length; row++) {
			for (int column = 0; column < gameArray[row].length; column++) {

				if (row == play.y && column == play.x) {
					System.out.print("9" + "\t");

				} else {
					System.out.print(gameArray[row][column] + "\t");
				}

			}

			System.out.println();
		}

	}
}