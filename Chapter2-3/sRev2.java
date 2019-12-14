import cs1.Keyboard;

public class sRev2
{
	public static void main (String[] args)
	{
		int totalSecs, hours, minutes, secs, totalSecs2;

		System.out.println ("State the amount of seconds you wish to make readable!");
		totalSecs = Keyboard.readInt();

		totalSecs2 = totalSecs;

		if ( (int) Math.floor( totalSecs / 3600) > 0) {
			hours = (int)  Math.floor(totalSecs / 3600);
			totalSecs -= hours * 3600;
			if ((int)Math.floor(totalSecs / 60) > 0) {
				minutes = (int) Math.floor(totalSecs / 60);
				secs = totalSecs - (minutes * 60);
			}else{
				minutes = 0;
				secs = totalSecs;
			}
		}else{
			hours = 0;
			if ((int) Math.floor(totalSecs / 60) > 0) {
				minutes = (int) Math.floor(totalSecs / 60);
				secs = totalSecs - (minutes * 60);
			}else{
				minutes = 0;
				secs = totalSecs;}
		}
		
		System.out.println (totalSecs2 + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + secs + " seconds.");
	}
}
