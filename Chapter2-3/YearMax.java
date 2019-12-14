import cs1.Keyboard;

public class YearMax {
	public static void main (String[] args) {
		String goOn = "yes";
		int year;

		System.out.println("State a year to check if it is a a leap year");
		year = Keyboard.readInt();
		System.out.println("              ");

		while (goOn.equals("yes")) {
			
			if (year == -1234) {
		      		System.out.println("              "); 
				System.out.println("Please state another year");
				year = Keyboard.readInt();
				System.out.println("              ");
			}

			while  (year < 1582) {
				System.out.println("You picked a year that happened before the Greorian calendar was adpoted (our current calendar) or you entered incorrect information");
				System.out.println("              ");
				System.out.println("Please pick another year");
				year = Keyboard.readInt();
				System.out.println("              ");
			}
			
		       	if (year % 400 == 0) {
				System.out.println(year + " is a leap year!");
			} else {
				if (year % 100 == 0) {
					System.out.println(year + " is not a leap year!");
				} else if (year % 4 == 0) {
					System.out.println(year + " is a leap year!");
				} else {
					System.out.println(year + " isn't a leap year");}
			}

			System.out.println("              ");
			System.out.println("If you want to test another year, write 'yes' otherwise write anything else");

			goOn = Keyboard.readString();
			goOn = goOn.toLowerCase();
			year = -1234;

		}
		
		System.out.println("              ");	
		System.out.println("Program Closed");

	}
}

		
