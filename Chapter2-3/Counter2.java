public class Counter2 {
	public static void main(String[] args) {
		final int limit = 5;
		int count = 0;

		do {
			System.out.println(count + 1);
			count ++;
		}

		while (count < limit);

		System.out.println("Done");
	}
}
