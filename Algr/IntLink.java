public class IntLink {
	private int size;
	private Node head;
	private Node tail;

	public IntLink() {
		this.size = 0;		
	}

	private static class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
		}

		public String toString() {
			return data + "";
		}
	}

	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public String toString() {
		String result = "";
		Node current = this.head;
		while (current != null) {
			result += current.toString() + " ";
			current = current.next;
		}
		return result;
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			tail.next = newNode;
			this.tail = newNode;
		}
		size++;
	}

	public int sum() {
		int sum = 0;
		Node current = head;
		while (current != null) {
			sum += current.data;
			current = current.next;
		}
		return sum;
	}

	public int getTail() {
		return this.tail.data;
	}

	public int getHead() {
		return this.head.data;
	}
}
