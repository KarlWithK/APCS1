import cs1.Keyboard;
public class sphereThings
{
	public static void main (String[] args)
	{
		int radius;
		double volume, sArea;
		
		System.out.println ("What is the radius of the sphere?");

		radius = Keyboard.readInt();
		volume =  Math.pow(radius, 3) * ( 4.0 / 3) * Math.PI;
		volume = (int) (10000 * volume + 0.5) / 10000.0;
		System.out.println ("The volume of this sphere is: " + volume);
		sArea =  4 * Math.PI *  Math.pow(radius, 2);
		sArea = (int) (10000 * sArea + 0.5) / 10000.0;
		System.out.println ("The Surface Area of this sphere is: " + sArea);
	}
}

