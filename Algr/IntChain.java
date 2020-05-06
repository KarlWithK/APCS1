public class IntChain {
	public static void main (String[] args) {
		IntLink nums = new IntLink();
		nums.insert(5);
		nums.insert(10);
		nums.insert(15);
		System.out.println(nums.sum());
	}
}
