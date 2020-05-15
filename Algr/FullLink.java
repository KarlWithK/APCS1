public class FullLink<T> {
	private int size;
	private Node<T> head;
	private Node<T> tail;

	public FullLink() {
		this.size = 0;
	}

	// private static class Node<T extends Comparable<Node<T>> implments
	// Comparable<Node<T>>
	private static class Node<T> {
		public T data;
		public Node<T> next;
		public Node<T> prev;

		public Node(T data) {
			this.data = data;
		}

		// public boolean equals(Node<T> anotherNode) {
		// return this.data.equals(anotherNode.data);
		// }

		// public int compareTo(Node<T> anotherNode) {
		// return getData().compareTo(anotherNode.getData());
		// }

		public String toString() {
			return data.toString() + "";
		}
	}

	private void setHead(T data) {
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
			newHead.next = head;
			head.prev = newHead;
			this.head = newHead;
			size++;
		}
	}

	public void insert(T data) {
		if (this.head == null)
			setHead(data);
		else {
			Node<T> newNode = new Node<T>(data);
			tail.next = newNode;
			newNode.prev = tail;
			this.tail = newNode;
			size++;
		}
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
			if (preNode.next != null)
				newNode.next = preNode.next;
			preNode.next = newNode;
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
				current = current.next;
			}
			return current;
		}
	}

	public boolean deleteAt(int index) {
		if (index > this.size - 1 || index < 0)
			return false;

		Node<T> temp;

		if (index == 0) {
			temp = head;
			this.head = temp.next;
		} else if (index == this.size - 1) {
			temp = tail.prev;
			this.tail = temp;
			temp.next = null;
		} else {
			Node<T> preNode = getNoteAt(index - 1);
			temp = preNode.next;
			preNode.next = temp.next;
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
			popped = this.head;
			this.head = head.next;
		} else if (index == this.size - 1) {
			popped = this.tail;
			this.tail = tail.prev;
			tail.next = null;
		} else {
			Node<T> preNode = getNoteAt(index - 1);
			popped = preNode.next;
			preNode.next = popped.next;
		}
size--;
		return popped.data;
	}

	// private boolean deleteNode(Node<T> target) {
	// Node<T> current = this.head;
	// while (!(current == target)) {
	// current = current.next;
	// if (current == this.tail)
	// return false;
	// }

	// int nodeLocation = indexOf(current.data);
	// deleteAt(nodeLocation);
	// return true;

	// }

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
				current = current.next;
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
		return this.size == 0;
	}

	public void clear() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		String result = "";
		Node<T> current = this.head;
		while (current != null) {
			result += current.toString() + " ";
			current = current.next;
		}
		return result;
	}
}
