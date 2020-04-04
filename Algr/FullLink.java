public class FullLink<T> {
	private int size = 0;
	private Node<T> head;
	private Node<T> tail;

	private static class Node<T> {
		public T data;
		public Node<T> nextNode;
		public Node<T> prevNode;

		public Node(T data) {
			this.data = data;
		}

		public boolean equals(Node<T> anotherNode) {
			return this.data.equals(anotherNode.data);
		}

		// public int compareTo(Node<T> anotherNode) {
		// return getData().compareTo(anotherNode.getData());
		// }

		public String toString() {
			return data + "";
		}
	}

	public void setHead(T data) {
		Node<T> startNode = new Node<T>(data);
		this.head = startNode;
		this.tail = startNode;
		size++;
	}

	public void insertHead(T data) {
		if (this.head == null)
			setHead(data);
		else {
			Node<T> newHead = new Node<T>(data);
			newHead.nextNode = this.head;
			head.prevNode = newHead;
			this.head = newHead;
			size++;
		}
	}

	public void insert(T data) {
		if (this.head == null)
			setHead(data);
		else {
			Node<T> nextNode = new Node<T>(data);
			tail.nextNode = nextNode;
			nextNode.prevNode = nextNode;
			tail = nextNode;
		}
		size++;
	}

	public void insert(T data, int index) {
		if (index > this.size || index < 0)
			throw new IndexOutOfBoundsException("Invalid index");

		if (index == 0)
			insertHead(data);
		else if (index == this.size)
			insert(data);
		else {
			Node<T> newNode = new Node<T>(data);
			Node<T> preNode = getNoteAt(index - 1);
			if (preNode.nextNode != null)
				newNode.nextNode = preNode.nextNode;
			preNode.nextNode = newNode;
			size++;
		}
	}

	private Node<T> getNoteAt(int index) {
		if (index > this.size - 1 || index < 0)
			throw new IndexOutOfBoundsException("Invalid index");

		if (index == 0)
			return this.head;
		else if (index == this.size - 1)
			return this.tail;
		else {
			Node<T> current = this.head;
			for (int i = 0; i < index; i++) {
				current = current.nextNode;
			}
			return current;
		}
	}

	public boolean deleteAt(int index) {
		if (index > this.size - 1 || index < 0)
			return false;

		Node<T> temp;

		if (index == 0) {
			temp = this.head;
			this.head = temp.nextNode;
		} else if (index == this.size - 1) {
			temp = tail.prevNode;
			this.tail = temp;
			temp.nextNode = null;
		} else {
			Node<T> preNode = getNoteAt(index - 1);
			temp = preNode.nextNode;
			preNode.nextNode = temp.nextNode;
		}
		size--;
		return true;
	}

	public T show(int index) {
		return getNoteAt(index).data;
	}

	public T pop(int index) {
		if (index > this.size - 1 || index < 0)
			throw new IndexOutOfBoundsException("Invalid index");

		Node<T> popped;
		if (index == 0) {
			popped = this.size;
			this.head = popped.nextNode;
		} else if (index == this.size - 1) {
			popped = this.tail;
			tail = tail.prevNode;
			tail.nextNode = null;
		} else {
			Node<T> preNode = getNoteAt(index - 1);
			popped = preNode.nextNode;
			preNode.nextNode = popped.nextNode;
		}

		size--;
		return popped.data;
	}

	public boolean deleteNode(Node<T> target) {
		Node<T> current = this.head;
		while (!(current == target)) {
			current = current.nextNode;
			if (current == this.tail)
				return false;
		}

		int nodeLocation = indexOf(current.data);
		deleteAt(nodeLocation);
		return true;

	}

	public boolean deleteNodeWithData(T data) {
		int index = indexOf(data);
		if (index > -1)
			return deleteAt(index);
		return false;
	}

	public void changeDataAt(T newData, int index) {
		getNoteAt(index).data = newData;
	}

	// public Node<T> getLastNode() {
	// Node<T> current = getHead();
	// while (current.getNext() != null) {
	// current = current.getNext();
	// }
	// return current;
	// }

	public int indexOf(T target) {
		int index = 0;
		Node<T> current = this.head;
		while (current != this.tail) {
			if (current.data.equals(target))
				return index;
			else {
				current = current.nextNode;
				index++;
			}
		}
		return -1;
	}

	public T getHead() {
		return this.head.data;
	}

	public T getTail() {
		return this.tail.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void clear() {
		this.size = 0;
		this.head = null;
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		String result = "";
		Node<T> current = this.head;
		while (current != null) {
			result += current.toString() + " ";
			current = current.nextNode;
		}
		return result;
	}
}
