package exercise_two;

public class Main {

	public static void main(String[] args) {
		HighlightTheEvenNumbers evenNumbers = new HighlightTheEvenNumbers();
		int[] getPerking = evenNumbers.sortAllNumbersAndFindEvenNumbers();
		for (int i = 0; i < getPerking.length; i++) {
			if (getPerking[i] != 0) {
				System.out.println("you can parking at " + getPerking[i]
						+ " of that month");
			}
		}
	}

}
