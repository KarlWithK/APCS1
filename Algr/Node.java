// public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
public class Node<T> {
	public T data;
	public Node<T> nextNode;

	public Node (T data) {
		this.data = data;
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

	public Node<T> getNext () {
		return this.nextNode;
	}

	// public boolean equals(Node<T> anotherNode) {
				
	// }

	// public int compareTo(Node<T> anotherNode) {
	// 	return getData().compareTo(anotherNode.getData());
	// }

	public String toString() {
		return data + "";
	}
}
