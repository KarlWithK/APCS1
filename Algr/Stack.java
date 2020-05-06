public class Stack<T> extends LimitedLink<T> {

	public Stack()	{
		super();
	}

	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			tail.next = newNode;
			// newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
