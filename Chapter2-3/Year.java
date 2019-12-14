import cs1.Keyboard;

public class Year {
	public static void main(String[] args)
		{
			int year;

			System.out.println("State a year to check if it is a leap year");
			year = Keyboard.readInt();

			while  (year < 1582) {
				System.out.println("You picked an year that happened before the Greorian calendar was adpoted (our current calendar) or you enterd incorrect information");
				System.out.println("Please pick another year");
				year = Keyboard.readInt();
			} if (year % 400 == 0) {
				System.out.println(year + " is a leap year!");
			} else {
				if (year % 100 == 0) {
					System.out.println(year + " is not a leap year!");
				} else if (year % 4 == 0) {
					System.out.println(year + " is a leap year!");
				} else {
					System.out.println(year + " isn't a leap year");}
			}
		}
}
