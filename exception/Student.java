package exception;

public class Student {

	String roll_no;
	String name;
	int age;
	String course;

	Student(String roll_no, String name, int age, String course)
			throws AgeNotWithinRangeException, NameNotValidException {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.course = course;

		if (age < 15 || age > 21) {
			throw new AgeNotWithinRangeException("Age not within range 15 to 21");
		}

		if (!name.matches("[a-zA-Z]*")) {
			throw new NameNotValidException("Name contains number or special symbols");
		}
	}

}
