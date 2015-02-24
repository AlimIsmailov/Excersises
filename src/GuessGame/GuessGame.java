package GuessGame;

public class GuessGame {
	public void startGame() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		int guessP1;
		int guessP2;
		int guessP3;

		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;

		int targetNum = (int) (Math.random() * 10);
		System.out.println("I'm thinking from the number between 0 and 9...");
		System.out.println("");

		p1.guess();
		p2.guess();
		p3.guess();

		guessP1 = p1.number;
		System.out.println("Player one guess - " + guessP1);
		guessP2 = p2.number;
		System.out.println("Player two guess - " + guessP2);
		guessP3 = p3.number;
		System.out.println("Player three guess - " + guessP3);

		if (guessP1 == targetNum) {
			p1IsRight = true;
		}
		if (guessP2 == targetNum) {
			p2IsRight = true;
		}
		if (guessP3 == targetNum) {
			p3IsRight = true;
		}

		if (p1IsRight || p2IsRight || p3IsRight) {
			System.out.println("");
			System.out.println("We have a winner!");
			if (p1IsRight == true) {
				System.out.println("Player one got it right");
			}
			if (p2IsRight == true) {
				System.out.println("Player two got it right");
			}
			if (p3IsRight == true) {
				System.out.println("Player three got it right");
			}
			System.out.println("Game over");
		} else {
			System.out.println("");
			System.out.println("Players will have to try again");
		}

	}

}
