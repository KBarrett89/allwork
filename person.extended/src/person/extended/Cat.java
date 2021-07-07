package person.extended;

public class Cat extends Pet {

	public Cat(String name, Integer age, String colour) {

		this.setName(name);
		this.setAge(age);
		this.setColour(colour);

	}

	@Override
	public void communicate() {
		System.out.println("Meow");
	}
}
