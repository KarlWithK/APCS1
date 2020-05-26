public class Chain {
	public static void main(String[] args) {
		LList<Integer> nums = new LList<Integer>();
		nums.setHead(5);
		nums.insert(12);
		System.out.println(nums);
		nums.insert(1, 2);
		System.out.println(nums);
		nums.insertHead(10);
		System.out.println(nums);
		nums.insert(50,0);
		System.out.println(nums);
		Node<Integer> two = nums.getNoteAt(2);
		System.out.println(two);
		nums.insert(100, 1);
		System.out.println(nums);
		nums.changeDataAt(64, 1);
		System.out.println(nums);
		nums.deleteAt(5);
		System.out.println(nums);
		nums.insert(50,4);
		System.out.println(nums);
		nums.deleteAt(0);
		System.out.println(nums);
		nums.deleteNodeWithData(50);
		System.out.println(nums);
		nums.changeDataAt(100, 2);
		System.out.println(nums);
		Node<Integer> popped = nums.pop(3);
		System.out.println(popped);
		nums.clear();
		System.out.println(nums);
	}
}
