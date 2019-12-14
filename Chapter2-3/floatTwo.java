import cs1.Keyboard;

public class floatTwo
{
	public static void main (String[] args)
	{
		float num1, num2;

		System.out.println ("Enter two floats!");

		num1 = Keyboard.readFloat();

		num2 = Keyboard.readFloat();

		System.out.println ("Their sum is: " + (num1 + num2));

		System.out.println ("Their difference is: " + (num1 - num2));

		System.out.println ("Their product is: " + (num1 * num2));
	}
}
