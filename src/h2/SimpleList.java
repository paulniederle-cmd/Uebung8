package h2;

public class SimpleList {
	public Node head;

	public SimpleList() {
		this.head = null;
	}

	public Node getFirst() {
		return head;
	}

	public Node getLast() {
		if (head == null) {
			return null;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		return current;

	}

	public void append(int newValue) {
		if (head == null) {
			head = new Node(newValue);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(newValue);
	}

	public Node findFirst(int value) {
		Node current = head;
		while (current != null) {
			if (current.value == value) {
				return current;
			}
			current = current.next;
		}
		return null;

	}

	public boolean insertAfter(int preValue, int newValue) {
		if (findFirst(preValue) == null) {
			return false;
		}
		Node current = findFirst(preValue);
		Node inserted = new Node(newValue);
		inserted.next = current.next;
		current.next = inserted;
		return true;
	}

	public boolean delete(int value) {
		if (head == null) {
			return false;
		}
		if (head.value == value) {
			head = head.next;
			return true;
		}
		Node current = head;
		while (current.next != null) {
			if (current.next.value == value) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		return false;

	}
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    Node current = head;
	    while (current != null) {
	        sb.append(current.value);
	        if (current.next != null) sb.append(" -> ");
	        current = current.next;
	    }
	    return sb.toString();
	}


}
