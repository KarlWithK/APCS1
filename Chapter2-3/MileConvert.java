import cs1.Keyboard;

public class MileConvert
{
	public static void main (String[] test)
	{
		float  mileNum;
	       
		double	numConvert;

		numConvert = 1.60935;

		System.out.println ("State the amount of miles to convert to kilometers");
		mileNum = Keyboard.readFloat();
		
		System.out.println (mileNum + " mile(s) in kilometers is " + (mileNum * numConvert) + " kilometers");
	}
}
