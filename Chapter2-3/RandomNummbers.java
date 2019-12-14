import java.util.Random;

public class RandomNummbers
{
	
	public static void main (String[] args)
	{
	Random g = new Random();
	
	int num1;

	num1 = g.nextInt(100) + 1;
	System.out.println ("From 1 to 100: " + num1);
	}
}

