package person.extended;

public abstract class Pet {

	private String name;

	private Integer age;

	private String colour;

	public Pet() {
		super();
	}

	public Pet(String name, int age, String colour) {
		super();
		this.name = name;
		this.age = age;
		this.colour = colour;

	}

	public abstract void communicate();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Colour: " + this.colour);
		System.out.print("Speak: ");
		this.communicate();
	}
}
