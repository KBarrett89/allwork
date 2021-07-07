package person.extended;

import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> users = new ArrayList<>();

	public void addPerson(Person person) {
		this.users.add(person);
	}

	public void removePerson(Person person) {
		this.users.remove(person);
	}

	public Person getPeople(int index) {
		return this.users.get(index);

	}

	public Person findByName(String name) {
		for (int i = 0; i < this.users.size(); i++) {
			if (this.getPeople(i).getName() == name) {
				return this.getPeople(i);
			}
		}
		return null;
	}

	public void print() {
		for (int i = 0; i < this.users.size(); i++) {
			users.get(i).print();

		}
	}
}