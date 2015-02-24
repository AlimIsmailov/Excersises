package exercise_two;

public class HighlightTheEvenNumbers {

	public int[] sortAllNumbersAndFindEvenNumbers() {
		int[] daysInMonth = { 2, 5, 8, 12, 23, 24, 26, 27 };
		int[] sortedArrayOfNumbers = new int[daysInMonth.length];
		for (int i = 0; i < daysInMonth.length; i++) {
			int j = daysInMonth[i];
			if (j % 2 == 0 && j != 0) {
				sortedArrayOfNumbers[i] = j;
			}
		}
		return sortedArrayOfNumbers;
	}

}
