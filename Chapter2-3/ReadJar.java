import cs1.Keyboard;

//Filename: ReadJar.java / 2.12
//Name: Carlos "Karl" Hernandez
//Osis: 217493030
//
//Description: A program that reads the amount of quaters, nickels, and pennies and returns their values in dollars and pennies. 
//
//Known bugs: If the user submits everything correctly then no errors. I mean you can't have half a penny, so it should only be ints.
//
//Learned: I learned how to use mod correctly to get what I want.

public class ReadJar
{
	public static void main (String[] args)
		{
			int quaters, nickels, pennies, dollars, total;

			System.out.println ("One at the time enter the amount of quaters, nickels, and pennies in the jar");

			quaters = Keyboard.readInt();
			nickels = Keyboard.readInt();
			pennies = Keyboard.readInt();
			
			total = quaters * 25 + nickels * 5 + pennies;
			dollars = total / 100;
			pennies = total % 100;

			System.out.println ("Given the amounts imputed, your total is worth " + dollars + " dollars and " + pennies + " cents");
		}
}
			


			
			
