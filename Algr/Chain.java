public class Chain {
	public static void main (String[] args) {
		LList<Integer> nums = new LList<Integer>();
		nums.setHead(5);
		nums.add(7);
		nums.setHead(10);
		System.out.println(nums.getSize());
	}
}
