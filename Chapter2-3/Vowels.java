//FileName: Vowels.java / 13.15
//Name: Carlos "Karl" Hernandez
//Osis: 217493030
//
//Descrpition: A program that counts how many lowercase vowels there are in a string and outputs their amount and also the number of non-vowel characters.
//
//Known bugs: None known to me. If you follow everything correctly it should work.
//
//Learned: like the last problem, this programed dealed with the char datatype and as I went through this program I realized that I didn't have to do anything fancy and just compared 'currentLetter' to the vowel I wanted. This is possible because char is a primitive datetype. After that it was a matter of copy n paste to finish the program. 

import cs1.Keyboard;

public class Vowels {
	public static void main(String[] agrs) {
		String line;
		char currentLetter;
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, other = 0, index, limit;

		System.out.println("Please state some text to check how many vowels are in it!");

		line = Keyboard.readString();
		limit = line.length();
		System.out.println();

		for (index = 0; index < limit; index++) {
			currentLetter = line.charAt(index);
			if (currentLetter == 'a') {
				aCount++;
			}else if (currentLetter == 'e') {
				eCount++;
			}else if (currentLetter == 'i') {
				iCount++;
			}else if (currentLetter == 'o') {
				oCount++;
			}else if (currentLetter == 'u') {
				uCount++;
			} else {
				other++;
			}
		}
		System.out.println("The number of a(s) is: " + aCount + ", the number of e(s) is: " + eCount + ", the number of i(s) is: " + iCount +  ", the number of o(s) is: " + oCount +  ", the number of u(s) is: " + uCount + ", and finally the number of non-vowel chracters is: " + other + "\nProgram Closed");
	}
}
