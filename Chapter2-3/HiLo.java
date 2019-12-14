import cs1.Keyboard;
import java.util.Random;

public class HiLo {
	public static void main(String[] args) {
		Random num = new Random();
		int key, guess, guesses = 0, again = 2748;

		key = num.nextInt(99) + 1;
		
		while (again == 2748) {
			System.out.println("Here is the deal: the game has a number between 1 and 100, guess it and you win! Now Guess");
			guess = Keyboard.readInt();
			while (guess != key && guess != -1234) {
				if (guess < key) {
					System.out.println("You guess was too low");
				} else if (guess > key) {
					System.out.println("You guess was too high");
				}
				guesses++;
				System.out.println("If you wish to quit, then enter -1234, if not then enter another guess");
				guess = Keyboard.readInt();

			}
		
			if (guess == key) {
				System.out.println("You won! The amount of tries you took was: " + guesses);
			}
		
			System.out.println("If you wish to play again type 2748, else type any other number");
			
			again = Keyboard.readInt();
		}

		System.out.println("\nProgram Closed");
	
	}
}
