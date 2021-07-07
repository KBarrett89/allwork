package person.extended;

public class Dog extends Pet {

	public Dog(String name, Integer age, String colour) {

		this.setName(name);
		this.setAge(age);
		this.setColour(colour);

	}

	@Override
	public void communicate() {
		System.out.println("Woof");
	}
}
