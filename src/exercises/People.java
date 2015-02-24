package exercises;

public class People {

	Fork fork = new Fork();
	Spoon spoon = new Spoon();
	Knife knife = new Knife();

	public void getDiningAllItems() {
		spoon.yourSpoon();
		fork.yourFork();
		knife.yourKnife();
	}

}
