package h1;

public class H1_Main {
	public static void main(String[] args) {
		Bruch b = new Bruch(15,9);
		Bruch c = new Bruch(50,30);
		System.out.println(c.hasSameValueAs(b));
		c.shorten();
	}

}
