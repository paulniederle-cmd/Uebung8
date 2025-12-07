package h2;

public class Node {
	public Node next = null;
	public int value = Integer.MIN_VALUE;

	public Node(int value) {
		this.value = value;
		this.next = null;
	}

	public String toString() {
		return "" + value + "";
	}

}
