// public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
public class Node<T> {
	private T data;
	private Node<T> nextNode;
	private Node<T> prevNode;

	public Node(T data) {
		this.data = data;
	}

	public Node<T> getPrev() {
		return this.prevNode;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNext(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getData() {
		return this.data;
	}

	public Node<T> getNext() {
		return this.nextNode;
	}

	public void setPrev(Node<T> prevNode) {
		this.prevNode = prevNode;
	}

	public boolean equals(Node<T> anotherNode) {
		return getData().equals(anotherNode.getData());
	}

	// public int compareTo(Node<T> anotherNode) {
	// return getData().compareTo(anotherNode.getData());
	// }

	public String toString() {
		return data + "";
	}
}
