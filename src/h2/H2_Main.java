package h2;

public class H2_Main {
	public static void main(String[] args) {
		SimpleList myList = new SimpleList();
		myList.append(12);
		myList.append(45);
		myList.append(66);
		myList.append(12);
		myList.append(45);
		myList.append(60);
		
		System.out.println(myList.insertAfter(45,4));
		System.out.println(myList.delete(45));
		System.out.println(myList);
		
		

	}
}
