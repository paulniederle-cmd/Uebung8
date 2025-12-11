package h1;

public class H1_Main {
	public static void main(String[] args) {
		Bruch a = new Bruch(15,9);
		Bruch b = new Bruch(50,30);
		System.out.println(a.hasSameValueAs(b));
		b.shorten();
	}

}
