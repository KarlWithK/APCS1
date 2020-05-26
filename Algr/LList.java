public class LList<T> {
	private int size = 0;
	private Node<T> head;
	private Node<T> tail;

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
			newHead.setNext(this.head);
			head.setPrev(newHead);
			this.head = newHead;
			size++;
		}
	}

	public void insert(T data) {
		if (getHead() == null)
			setHead(data);
		else {
			Node<T> nextNode = new Node<T>(data);
			tail.setNext(nextNode);
			nextNode.setPrev(tail);
			tail = nextNode;
		}
		size++;
	}

	public void insert(T data, int index) {
		if (index > getSize() || index < 0)
			throw new IndexOutOfBoundsException("Invalid index");

		if (index == 0)
			insertHead(data);
		else if (index == getSize())
			insert(data);
		else {
			Node<T> newNode = new Node<T>(data);
			Node<T> preNode = getNoteAt(index - 1);
			if (preNode.getNext() != null)
				newNode.setNext(preNode.getNext());
			preNode.setNext(newNode);
			size++;
		}
	}

	public Node<T> getNoteAt(int index) {
		if (index > getSize() - 1 || index < 0)
			throw new IndexOutOfBoundsException("Invalid index");

		if (index == 0)
			return getHead();
		else if (index == getSize() - 1)
			return getTail();
		else {
			Node<T> current = getHead();
			for (int i = 0; i < index; i++) {
				current = current.getNext();
			}
			return current;
		}
	}

	public boolean deleteAt(int index) {
		if (index > getSize() - 1 || index < 0)
			return false;

		Node<T> temp;

		if (index == 0) {
			temp = getHead();
			this.head = temp.getNext();
		} else if (index == getSize() - 1) {
			temp = tail.getPrev();
			this.tail = temp;
			temp.setNext(null);
		} else {
			Node<T> preNode = getNoteAt(index - 1);
			temp = preNode.getNext();
			preNode.setNext(temp.getNext());
		}
		size--;
		return true;
	}

	public Node<T> pop(int index) {
		if (index > getSize() - 1 || index < 0)
			throw new IndexOutOfBoundsException("Invalid index");

		Node<T> popped;
		if (index == 0) {
			popped = getHead();
			this.head = popped.getNext();
		} else if (index == getSize() - 1) {
			popped = this.tail;
			tail = tail.getPrev();
			tail.setNext(null);
		} else {
			Node<T> preNode = getNoteAt(index - 1);
			popped = preNode.getNext();
			preNode.setNext(popped.getNext());
		}

		size--;
		return popped;
	}

	public boolean deleteNode(Node<T> target) {
		Node<T> current = getHead();
		while (!(current == target)) {
			current = current.getNext();
			if (current == this.tail)
				return false;
		}

		int nodeLocation = indexOf(current.getData());
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
		getNoteAt(index).setData(newData);
	}

	// public Node<T> getLastNode() {
	// Node<T> current = getHead();
	// while (current.getNext() != null) {
	// current = current.getNext();
	// }
	// return current;
	// }

	public int indexOf(T data) {
		int index = 0;
		Node<T> current = getHead();
		while (current != this.tail) {
			if (current.getData().equals(data))
				return index;
			else {
				current = current.getNext();
				index++;
			}
		}
		return -1;
	}

	public Node<T> getHead() {
		return this.head;
	}

	public Node<T> getTail() {
		return this.tail;
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
			result += current + " ";
			current = current.getNext();
		}
		return result;
	}
}
