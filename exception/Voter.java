package exception;

public class Voter {
	String voterID;
	String name;
	int age;

	Voter(String voterID, String name, int age) throws InvalidAgeException {
		this.voterID = voterID;
		this.name = name;
		this.age = age;

		if (age < 18) {
			throw new InvalidAgeException("Invalid age for voter.");
		}

//        if(!name.matches("[a-zA-Z]*")) {
//            throw new NameNotValidException("Name contains number or special symbols");
//        }
	}
}
