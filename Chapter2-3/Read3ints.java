import cs1.Keyboard;

public class Read3ints
{
	public static void main (String[] args)
	{
		int num1, num2, num3;
		
		System.out.println ("Enter three intergers!");

		num1 = Keyboard.readInt();

		num2 = Keyboard.readInt();

		num3 = Keyboard.readInt();

		System.out.println ("Their average is: " + ((num1 + num2 + num3)/ 3));
	}
}
