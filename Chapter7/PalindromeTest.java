public class PalindromeTest {
	public static void main (String[] args) {
		System.out.println(PaliTest("nani"));
		System.out.println(PaliTest("racecar"));
		System.out.println(PaliTest("karl"));
		System.out.println(PaliTest("bruh"));
		System.out.println(PaliTest("nun"));
	}

	public static boolean PaliTest(String Word) {
		int right = Word.length() - 1;
		if (Word.length() == 0 || Word.length() == 1)
			return true;
		if (Word.charAt(0) == Word.charAt(right))
			return PaliTest(Word.substring(1, right));
		return false;
	}
}
