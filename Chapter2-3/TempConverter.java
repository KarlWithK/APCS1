import cs1.Keyboard;

public class TempConverter
{
	public static void main (String[] args)
	{
		double  convertingFactor, inputNum, celsiusNum;
		
		convertingFactor = (5.0/9.0);

		System.out.println ("Pick a number to convert to Celsius");

		inputNum = Keyboard.readFloat();

		System.out.println ("The temperature in Celsius is: ");

		celsiusNum = (inputNum - 32) * convertingFactor;

		System.out.println (celsiusNum);

	}
}
				
