public class LimitedLink<T> {
	protected int size;
	protected Node<T> head;
	protected Node<T> tail;

	public LimitedLink() {
		this.size = 0;
	}

	protected static class Node<T> {
		public T data;
		public Node<T> next;
		public Node<T> prev;

		public Node(T data) {
			this.data = data;
		}

		public String toString() {
			return data.toString() + "";
		}
	}

	public void clear() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		String result = "";
		Node<T> current = this.head;
		while (current != null) {
			result = current.toString() + " ";
			current = current.next;
		}
		return result;
	}

}
