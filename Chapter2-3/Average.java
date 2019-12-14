import cs1.Keyboard;
import java.text.DecimalFormat;

public class Average
{
	public static void main (String[] args)
	{
		int sum = 0, value, count = 0;
		double average;

		System.out.print ("Enter an integer (0 to quit ): ");
		value = Keyboard.readInt();
		
		while (value != 0)
		{
			count ++;

			sum += value;

			System.out.println ("THe sum so far is " + sum);

			System.out.print ("Enter an interger (0 to quit): ");
			value = Keyboard.readInt();
		}

		System.out.println ();
		System.out.println ("Number of values entered: " + count);

		if (count == 0) {
			average = 0;
		} else {
			average = (double) sum / count;
		} DecimalFormat fmt = new DecimalFormat ("0.###");
	}
}
