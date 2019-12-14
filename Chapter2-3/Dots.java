//FileName: Dots.java / 3.13
//Name: Carlos "Karl" Hernandez
//OSIS: 217493030
//
//Description: A program which produces 4 patterns based on the information given in 3.13. Instead of 4 files, I have combined them in one file.
//
//Known bugs: None, but I split D into two parts, so I think there is a better way to do this.
//
//Learned: I have learned to manipulate for loops to achieve the results I wanted. In this case patterns. Furthermore, how to position my statements to make sure the patterns appears. 




public class Dots {
	public static void main(String[] args) {
		int a, b, c, d, check = 0, space, row;

		System.out.println("\nA\n"); // Pattern A

		for (a = 10; a > 0; a--) {
			for ( row = a; row > 0; row --) {
				System.out.print("*");	
			}
			System.out.print("\n");
		}

		System.out.println("\nB\n"); // Pattern B

		for (b = 0; b < 10; b++) {
			for (space = 9 - b; space > 0; space--) {
				System.out.print(" ");
			}

			for (row = 0; row < b + 1; row++) {
				System.out.print("*");
			}

			System.out.print("\n");
		}

		System.out.println("\nC\n"); // Pattern C

		for (c = 10; c > 0; c--) {
			for(space = 10 - c; space > 0; space--) {
				System.out.print(" ");
			}

			for (row = c; row > 0; row-- ) {
				System.out.print("*");
			}

			System.out.print("\n");

		}
	
		System.out.println("\nD"); // Pattern D
	
		for (d = 1; d <= 9; d+= 2) {

			for (space = 4 - check; space > 0; space --) {
				System.out.print(" ");
			}
			for (row = d; row > 0; row--) {
				System.out.print("*");
			}
			for(space = 4 - check; space > 0; space--) {
				System.out.print(" ");
			}
			System.out.print("\n");
			check++;
		}

		for (d = 9; d >= 1; d -= 2) {
			for (space = 5 - check; space > 0; space--) {
				System.out.print(" ");
			}
			for (row = d; row > 0; row-- ) {
				System.out.print("*");
			}
			for (space = 5 - check; space > 0; space--) {
				System.out.print(" ");
			}
			System.out.print("\n");
			check--;
		}
		
		System.out.println("\nProgram Closed");
	}
}
