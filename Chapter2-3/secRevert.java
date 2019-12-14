import cs1.Keyboard;

public class secRevert
{
	public static void main (String[] whatIf)
	{
		int totalSecs, hours, minutes, secs;

		System.out.println ("State the total amount of seconds you wish to make readable");

		totalSecs = Keyboard.readInt();

		if (((totalSecs - (totalSecs % 3600)) % 3600) == 0) {
			hours = (totalSecs - (totalSecs % 3600)) / 3600;
			int noHours;
			noHours = totalSecs - (hours * 3600);
			if (((noHours - (noHours % 60)) % 60) == 0) {
				minutes = (noHours - (noHours % 60)) / 60;
		       		secs = noHours - (minutes * 60);	
			}else {
				minutes = 0;
				secs = noHours;
			}
		}else if (((totalSecs - (totalSecs % 60)) % 60) == 0) {
			hours = 0;
			minutes = (totalSecs - (totalSecs % 60)) / 60;
			secs  = totalSecs - (minutes * 60);
		}else {
			hours = 0;
			minutes = 0; 
			secs = totalSecs;
		}
		
		System.out.println (totalSecs + " seconds is equal to " + hours + " hours " + minutes + " minutes and " + secs + " seconds.");
	}
}
