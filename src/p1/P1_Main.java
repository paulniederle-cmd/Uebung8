package p1;

public class P1_Main {
	public static void main(String[] args) {
		int n = 69;
		System.out.println(getNumber(n));
	}

	public static int getNumber(int a) {
		int temp = (a > 42) ? 42 : 0;
		return temp;
	}

}
