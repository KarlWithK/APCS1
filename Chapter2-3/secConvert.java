import cs1.Keyboard;

public class secConvert
{
	public static void main (String[] idk)
	{
		int hours, minutes, seconds;

		System.out.println ("State the amount of hours you wish to convert");
		hours = Keyboard.readInt();

		System.out.println ("State the amount of minutes your wish to covert");
		minutes = Keyboard.readInt();

		System.out.println ("State the amount of seconds");

		seconds = Keyboard.readInt();

		System.out.println ("Your total time in seconds is: " + ((hours * 3600) + (minutes * 60) + seconds));
	}
}
