package exercises;

public class Table {

	public void DiningItemsForPersons(int howManyPersons) {
		People people = new People();
		for (int i = 0; i < howManyPersons; i++) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			people.getDiningAllItems();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}

}
