package core.java;

public class Main {

	public static void main(String[] arg) {
		Main main = new Main();
		System.out.println(main.test(4));
	}

	String test(int n) {
		String tmp = "?";
		if (n < 3)
			n--;
		switch (n) {
		case 1:
			return "one";
		case 2:
			n = 3;
		case 3:
			break;
		case 4:
		default:
			return tmp;
		}
		return "Result " + n;
	}

}