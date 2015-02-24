package core.java;

public class TesterB extends Tester {
	final Tester tester = new Tester();

	final void yyy() {
		System.out.println("In method yyy()");
		tester.xxx = 12345;
	}
}
