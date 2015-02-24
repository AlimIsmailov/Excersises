package core.java;

public class PalindromicNumbers {

	private static final int FIRST_NUMBER = 1000;
	private static final int SECOND_NUMBER = 1000;
	public String maxNumber;

	public void numberCounter() {

		for (int i = 100; i < FIRST_NUMBER; i++) {
			for (int x = 100; x < SECOND_NUMBER; x++) {
				int limit = i * x;
				String revers = new StringBuffer("" + limit).reverse()
						.toString();
				String numbers = new StringBuffer("" + limit).toString();
				if (numbers.equals(revers)) {
					maxNumber = numbers;
					System.out.println(numbers);
				}
			}
		}
		System.out.println(maxNumber);
	}
}