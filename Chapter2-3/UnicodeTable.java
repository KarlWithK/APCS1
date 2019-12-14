//Filename: UnicodeTable.java / 3.14
//Name: Carlos "Karl" Hernandez
//Osis: 217493030
//Description: A program that prints parts of the ASCII table. Specificically from the space character to the tilde character. The table has 5 columns.
//
//Known bugs: None that I could find.
//
//Learned: I think this wass an intersting problem because it made me work with the char datatype - something I had not done before. I was able to learn about it and realized that this was a very simple problem. The hardest part was to just convert the character to int. 


public class UnicodeTable {
	public static void main (String[] args) {
		int Per_line = 5, count = 0;
		for (char character = 32; character < 127; character++) {
			System.out.print((int) character + ": " + character + "\t");
			count++;
			if (count % Per_line == 0) {
				System.out.print("\n");
			}
		}
	}
}
