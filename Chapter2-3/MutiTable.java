import cs1.Keyboard;

public class MutiTable {
	public static void main(String[] args) {
		int row	= 0, columnNum = 1, nextNum = 1, limit, rowLimit;

		System.out.println("Please state an int to make a mutiplication table. If, for example, 12 is stated then the table will be 12 x 12");

		rowLimit = Keyboard.readInt();

		System.out.println("    ");
		
		while (row <= rowLimit) {

			System.out.print(row + "\t");
			limit = (rowLimit * nextNum);
			nextNum = 1;
	
			while (columnNum <= limit) {
				System.out.print(columnNum + "\t");
				if (row	<= 1) {
					columnNum ++;
				} else {
					nextNum ++;
					columnNum = row * nextNum;
				}
			}

			row ++;

			if (row <= 1) {
				nextNum = 1;
				columnNum = 1;
			} else {
				nextNum = row;
				columnNum = row;
			}

			System.out.println("");

		}

		System.out.println("  ");
		System.out.println("Program Closed");
	}
}
