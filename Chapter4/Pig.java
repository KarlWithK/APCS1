import cs1.Keyboard;

public class Pig {
	public static void main (String[] args) {
		PairOfDice dice = new PairOfDice();
		int AIPoints = 0, userPoints = 0, again = 1, outCome;
		final int goal = 100;
		while (userPoints < goal && AIPoints < goal) {
			while (again == 1) {

				outCome = dice.faceRoll(1, "You");
				if (outCome == -1) {
					userPoints = 0;
					System.out.println("You rolled two ones. Sorry you have lost all the points gathered so far :(");
					again = 0;
				} else if (outCome == 0) {
					System.out.println("You rolled a one, so all points gathered this round are lost");
					again = 0;
				} else {
					userPoints += outCome;
					System.out.println("\nYou got no ones! Points added to your pointCount.\nYour current amount of points is " + userPoints);
					if (userPoints > 99) {
						again = 3;
					} else {
						System.out.println("\nPlease decide if you want to roll again (be a pig and risk losing all your points) or have the computer roll now. If you want to roll again enter 1, otherwise 0.");
						again = Keyboard.readInt();
					}
				}
			}

			if (again != 1 || again != 0 && userPoints < 100 & AIPoints < 100) {
				again = 0;
			}
			
			System.out.println("\nIt's the AI's turn now!\n");
			

			while (again == 0) {

				outCome = dice.faceRoll(1, "AI");
				if (outCome == -1) {
					AIPoints = 0;
					System.out.println("The AI rolled two ones. It loses all its points :( - \nyour turn tho.");
					again = 1;
				} else if (outCome == 0) {
					System.out.println("AI rolled a one, so it gets no points this round!\n\nYour turn.");
					again = 1;
				} else {
					AIPoints += outCome;
					System.out.println("The AI got no ones! Points are added to its pointCount.\nIts current amount of points is " + AIPoints);
					if (AIPoints > 99) {
						again = 3;
					} else if (AIPoints >= 20) {
						again = 1; // makes it the user's turn.
						System.out.println("The computer decides not to risk it anymore.\n\nYour turn");
					} else {
						again = 0; // becomes a pig until it gets more the 20
						System.out.println("The computer decides to become a pig and rolls more");
					}
				}
			} 

			if (again != 1 || again != 0 && userPoints < 100 & AIPoints < 100) {
				again = 1;
			}
		}

		if (userPoints >= 100) {
			System.out.println("\nYou won!");
		} else {
			System.out.println("\nThe AI won - bruh moment");
		}

		System.out.println("\nProgram Closed");

	}
}
