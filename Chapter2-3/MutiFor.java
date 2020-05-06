import cs1.Keyboard;

public class MutiFor {
	public static void main(String[] args) {
		int rowNum, columnNum, rowLimit, limit, nextNum;

		System.out.println("Please state the rowLimit and columnlimit one at a time. For example, writing 12 and then 13 will give you 12 rows and 13 columns or a 12 x 13 table");
		rowLimit = Keyboard.readInt();
		limit = Keyboard.readInt();
		System.out.println("\n");

		for (rowNum = 0; rowNum <= rowLimit; rowNum ++) {

			System.out.print(rowNum + "\t");
			nextNum = 1;

			if (rowNum <= 1) {
				for (columnNum = 1; columnNum <= limit; columnNum++) {
					System.out.print(columnNum + "\t");
				}
			} else {
				for (columnNum = rowNum; columnNum <= limit * rowNum; columnNum = rowNum * nextNum) {
					System.out.print(columnNum + "\t");
					nextNum++;
				}
			}

			System.out.println("\n");
		}

		System.out.println("\n" + "Progran Closed");
	}
}
