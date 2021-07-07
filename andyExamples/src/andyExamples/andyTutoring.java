package andyExamples;

public class andyTutoring {

	public static void main(String[] args) {

		boolean weekday = true;
		boolean vacation = true;

		if (weekday) {
			System.out.println("work");
		} else {
			System.out.println("Play");

			if (vacation) {
				System.out.println("sleep in");
			} else {
				System.out.println("GET UP!");
			}
		}
	}
}