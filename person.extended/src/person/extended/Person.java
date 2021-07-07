package person.extended;

import java.util.ArrayList;

public class Person {

	private String name;

	private Integer age;

	private String jobTitle;

	private ArrayList<Pet> listOfPets = new ArrayList<>();

	public Person(String name, Integer age, String jobTitle) {

		this.setName(name);
		this.setAge(age);
		this.setjobTitle(jobTitle);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 110) {
			this.age = age;
		} else {
			System.out.println("Invalid age: " + age);
		}
	}

	public String getjobTitle() {
		return jobTitle;
	}

	public void setjobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void addPet(Pet pet) {
		listOfPets.add(pet);
	}

	public void removePet(Pet pet) {
		listOfPets.remove(pet);

	}

	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Job Title: " + this.jobTitle);

		System.out.println("Pets: [");
		// for (int i = 0; i < this.listOfCats.size(); i++) {
		// listOfCats.get(i).print();
		for (Pet c : this.listOfPets) {
			c.print();
		}
		System.out.println("]");

	}
}
