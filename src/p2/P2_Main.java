package p2;

public class P2_Main {
	public static void main(String[] args) {
		System.out.println(shortenToLowerCase("RindfLeischetikETTierung", 13));
	}

	public static String shortenToLowerCase(String input, int shortenBy) {
		if (shortenBy >= input.length())
			return "";
		input = input.substring(0, input.length() - shortenBy);
		return input.toLowerCase();
	}
}
