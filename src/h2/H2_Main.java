package h2;

public class H2_Main {
	public static void main(String[] args) {
		SimpleList myList = new SimpleList();
		myList.append(40);
		myList.findFirst(40);
		myList.getFirst();
		myList.getLast();
		myList.insertAfter(40,60);
		myList.delete(60);
		
	}
}
