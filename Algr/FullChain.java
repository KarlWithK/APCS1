public class FullChain {
        public static void main(String[] args) {
        FullLink<Integer> nums = new FullLink<Integer>();
        nums.insert(5);
        nums.insert(12);
        nums.insert(13);
        System.out.println(nums);
        nums.insert(1, 2);
        System.out.println(nums);
        nums.insertHead(10);
        System.out.println(nums);
        nums.insert(50,0);
        System.out.println(nums);
        Integer two = nums.show(2);
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
        Integer popped = nums.pop(2);
        System.out.println(popped);
        System.out.println(nums);
        nums.clear();
        nums.clear();
        }
}
