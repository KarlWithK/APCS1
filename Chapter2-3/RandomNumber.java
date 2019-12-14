import java.util.Random;

//Filename: RandomNumber.java / 2.13
//Name: Carlos "Karl" Hernandez
//Osis: 217493030
//
//Description: The program will generate a random number that can't have 8s or 9s in the first 3 digits, can't be greater than 742 in the second set, can is random the last set.
//
//Known Bugs: None known to me.
//
//Learned: I have learned how to generate random numbers and manipulate how I get them. 

public class RandomNumber
{
	public static void main (String[] args)
	{
		Random num = new Random();
		int first, second, third, secondSet, thirdSet;

		first = num.nextInt(8);
		second  = num.nextInt(8);
		third  = num.nextInt(8);
		secondSet = num.nextInt(642) + 100;
		thirdSet = num.nextInt(900) + 100;

		System.out.println ("A random phone number is: " + first + second + third + "-" + secondSet + "-" + thirdSet);
	}
}

