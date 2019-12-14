import cs1.Keyboard;
import java.lang.Math;
public class distance
{
	public static void main (String[] args)
	{
		int x1, x2, y1, y2, xdiff, ydiff;
		double dis, diff;

		System.out.println ("State your x1, y1, x2, y2 corrs one at a time.");
		x1 = Keyboard.readInt();
		y1 = Keyboard.readInt();
		x2 = Keyboard.readInt();
		y2 = Keyboard.readInt();
		xdiff = x2 - x1;
		ydiff = y2 - y1;
		xdiff *= xdiff;
		ydiff *= ydiff;
		diff = xdiff + ydiff;
		dis = Math.sqrt(diff);

		System.out.println ("The distance between the two points is " + dis);
	}
}
