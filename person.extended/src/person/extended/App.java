package person.extended;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Pet> pets = new ArrayList<>();

		pets.add(new Cat("Jam", 2, "red"));
		pets.add(new Cat("Tuna", 11, "grey"));
		pets.add(new Cat("Midnight", 5, "black"));
		pets.add(new Cat("Cotton", 9, "white"));

		pets.add(new Dog("Jasper", 15, "yellow"));
		pets.add(new Dog("Winston", 3, "pink"));
		pets.add(new Dog("Ben", 5, "blue"));
		pets.add(new Dog("Richard", 9, "orange"));

		for (int i = 0; i < pets.size(); i++) {
			Pet petsPop = pets.get(i);
			petsPop.print();
			System.out.println(petsPop.getClass().getName()); // how you get a class of an object to print
		}

		Person Gina = new Person("Gina", 45, "Hitwoman");
		Person Nemo = new Person("Nemo", 18, "Sailor");
		Person Bryan = new Person("Bryan", 66, "Back up dancer");
		Person Jamie = new Person("Jamie", 25, "Warrior");

		Gina.addPet(new Cat("Wilma", 5, "rainbow"));
		Nemo.addPet(new Cat("Vimpto", 1, "purple"));
		Bryan.addPet(new Dog("Oscar", 16, "white"));

		PersonManager manager = new PersonManager();
		manager.addPerson(Gina);
		manager.addPerson(Nemo);
		manager.addPerson(Bryan);
		manager.addPerson(Jamie);

		manager.print();

	}
}
