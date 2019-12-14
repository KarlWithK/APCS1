import cs1.Keyboard;

public class triangleLength
{
	public static void main (String[] args)
	{
		int a, b, c;
		double  s, area;
		
		System.out.println ("Enter the side measures of a triangle one side at a time.");

		a = Keyboard.readInt();
		b = Keyboard.readInt();
		c = Keyboard.readInt();
		s = (a + b + c) / 2;
		area = s * (s - a) * (s - b) * (s - c);
		if (area == 0) {
			System.out.println ("You can't make a triangle with these measurements >:(");
		}else{
			area = Math.sqrt(area);
			System.out.println ("Given your side lengths, the area of the triangle is " + area);
		}

	}
}
