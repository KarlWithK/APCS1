public class LList<T> {
	private	int size = 0;
	private Node<T> head;

	public void setHead(T data) {
		Node<T> newHead = new Node<T>(data);
		if (this.head != null) {
			newHead.setNext(this.head);
			this.head = newHead;
		} else
			this.head = newHead;
		size++;
	}

	// public void changeHead(T data) {
	// 	Node<T> newHead = new Node<T>(data);
	// 	if (this.head != null && this.head.getNext() != null) {
	// 		newHead.setNode(this.head.getNext());
	// 		// Remember to change prevNode in the nextNode //
	// 		this.head = newHead;
	// 	} else
	// 		this.head = newHead;
	// 	size++;
	// }
	//
	// implement get preev and insert at any index

	public void add(T data) {
		Node<T> nextNode = new Node<T>(data);

		if (head == null) head = nextNode;
		else {
			Node<T> lastNode = getLastNode();
			lastNode.setNext(nextNode);
		}
		size++;
	}

	public Node<T> getLastNode() {
		Node<T> current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		return current;
	}

	public Node<T> getHead() {
		return this.head;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		String result = "";
		Node<T> current = head;
		while (current != null) {
			result += current.toString() + " ";
			current = current.getNext();
		}
		return result;
	}
}
