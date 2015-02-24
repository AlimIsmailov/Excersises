package core.java;

public class LoopClass {

	public static void main(String[] args) {

		int beerNum = 10;

		String word = "bottles";

		while (beerNum > 0) {
			System.out.println(beerNum + " " + word + " of beer on the Wall");
			System.out.println(beerNum + " " + word + " of beer");
			if (beerNum == 1) {
				System.out.println("Take last down");
			} else {
				System.out.println("Take one down.");
			}
			System.out.println("Pass it around");
			beerNum = beerNum - 1;

			if (beerNum > 0) {
				if (beerNum == 1) {
					word = "bottle";
				}

				System.out.println(beerNum + " " + word + " of beer on the Wall");
				System.out.println("                  ");
			} else {
				System.out.println("No more bootles of beer on the Wall");
			}
		}

	}
}
