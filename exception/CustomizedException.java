package exception;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;

public class CustomizedException {

	public static void main(String[] args) {
		Scanner myScnner = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		HashMap<String, Integer> studentGrades = new HashMap<String, Integer>();
		Stack<Integer> stack = new Stack<>();
		int projectNo;
		String rollNo;
		ArrayList<Voter> VoterList = new ArrayList<>();
		String voterID;
		int age;
		String course;
		String name;
		int value;
		int grade;

		while (true) {
			while (true) {
				try {
					System.out.println("Project 1 : Student");
					System.out.println("Project 2 : Voter");
					System.out.println("Project 3 : Day position");
					System.out.println("Project 4 : Add Student Grade");
					System.out.println("Project 5 : Display Student Grade");
					System.out.println("Project 6 : Remove Student Grade");
					System.out.println("Project 7 : Add data to the stack");
					System.out.println("Project 8 : Pop the data from stack");
					System.out.println("Project 9 : check stack is empty or not");
					if (myScnner.hasNextInt()) {
						projectNo = myScnner.nextInt();
						myScnner.nextLine();
						break;
					} else {
						System.out.println("Input invalid! Please Project No.");
						myScnner.nextLine();
					}
				} catch (Exception e) {
					System.out.println("Input invalid! Please Project No.");
					myScnner.nextLine();
				}

			}

			switch (projectNo) {

			case 1:
				
				System.out.println("Please Roll No.");
				
				while (true) {
					rollNo = myScnner.nextLine();
					if (!rollNo.isEmpty()) {
						break;
					} else {
						System.out.println("Input invalid! Please enter RollNo.");
					}
					myScnner.nextLine();
				}

				System.out.println("Please enter age.");

				while (true) {
					try {
						if (myScnner.hasNextInt()) {
							age = myScnner.nextInt();
							myScnner.nextLine();
							break;
						} else {
							System.out.println("Input invalid! Please enter age.");
							myScnner.nextLine();
						}
					} catch (Exception e) {
						System.out.println("Input invalid! Please enter age.");
						myScnner.nextLine();
					}
				}

				System.out.println("Please enter name.");

				while (true) {
					name = myScnner.nextLine();
					if (!name.isEmpty()) {
						break;
					} else {
						System.out.println("Input invalid! Please enter name.");
						myScnner.nextLine();
					}
				}

				System.out.println("Please enter course.");

				while (true) {
					try {
						course = myScnner.nextLine();
						if (!course.isEmpty()) {
							break;
						} else {
							System.out.println("Input invalid! Please enter name.");
							myScnner.nextLine();
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}

				try {
					Student student = new Student(rollNo, name, age, course);
					studentList.add(student);
				} catch (AgeNotWithinRangeException | NameNotValidException e) {
					System.out.println(e.getMessage());
				}

				System.out.println("**********************************************");
				break;

			case 2:

				System.out.println("Please enter Voter ID.");

				while (true) {
					voterID = myScnner.nextLine();
					if (!voterID.isEmpty()) {
						break;
					} else {
						System.out.println("Input invalid! Please enter Voter ID.");
					}
					myScnner.nextLine();
				}

				System.out.println("Please enter age.");

				while (true) {
					try {
						if (myScnner.hasNextInt()) {
							age = myScnner.nextInt();
							myScnner.nextLine();
							break;
						} else {
							System.out.println("Input invalid! Please enter age.");
							myScnner.nextLine();
						}
					} catch (Exception e) {
						System.out.println("Input invalid! Please enter age.");
						myScnner.nextLine();
					}
				}

				System.out.println("Please enter name.");

				while (true) {
					name = myScnner.nextLine();
					if (!name.isEmpty()) {
						break;
					} else {
						System.out.println("Input invalid! Please enter name.");
						myScnner.nextLine();
					}
				}

				try {
					Voter voter = new Voter(voterID, name, age);
					VoterList.add(voter);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				System.out.println("**********************************************");
				break;
			case 3:

				int dayPosition;
				System.out.println("Please enter day position.");

				while (true) {
					try {
						if (myScnner.hasNextInt()) {
							dayPosition = myScnner.nextInt();
							try {
								System.out.println("The day is " + weekdays[dayPosition]);
							} catch (ArrayIndexOutOfBoundsException e) {
								System.out.println("Day should be in the range 0-6.");
							} catch (Exception e) {
								System.out.println("Invalid input. Please enter a number .");
							}
							myScnner.nextLine();
							break;
						} else {
							System.out.println("Input invalid! Please enter day position.");
							myScnner.nextLine();
						}
					} catch (Exception e) {
						System.out.println("Input invalid! Please enter day.");
						myScnner.nextLine();
					}
				}

				System.out.println("**********************************************");
				break;
			case 4:
				System.out.println("Please enter student name.");
				while (true) {
					name = myScnner.nextLine();
					if (!name.isEmpty()) {
						break;
					} else {
						System.out.println("Input invalid! Please enter student name.");
					}
					myScnner.nextLine();
				}
				System.out.println("Please enter grade.");
				while (true) {
					try {
						if (myScnner.hasNextInt()) {
							grade = myScnner.nextInt();
							myScnner.nextLine();
							break;
						} else {
							System.out.println("Input invalid! Please enter grade.");
							myScnner.nextLine();
						}
					} catch (Exception e) {
						System.out.println("Input invalid! Please enter grade.");
						myScnner.nextLine();
					}

				}
				studentGrades.put(name, grade);
				System.out.println("Student Grade added successfully.");

				System.out.println("**********************************************");
				break;
			case 6:
				System.out.println("Please enter student name.");
				while (true) {
					name = myScnner.nextLine();
					if (!name.isEmpty()) {
						break;
					} else {
						System.out.println("Input invalid! Please enter student name.");
					}
					myScnner.nextLine();
				}
				if (studentGrades.containsKey(name)) {
					System.out.println("Removed successfully.");
					studentGrades.remove(name);
				} else {
					System.out.println("No student found with the name " + name);
				}

				System.out.println("**********************************************");
				break;

			case 5:

				System.out.println("Please enter student name.");

				while (true) {
					name = myScnner.nextLine();
					if (!name.isEmpty()) {
						break;
					} else {
						System.out.println("Input invalid! Please enter student name.");
					}
					myScnner.nextLine();
				}
				if (studentGrades.containsKey(name)) {
					System.out.println("The grade of " + name + " is " + studentGrades.get(name));
				} else {
					System.out.println("No student found with the name " + name);
				}

				System.out.println("**********************************************");
				break;
			case 7:
				System.out.println("Please enter Value.");

				while (true) {
					try {
						if (myScnner.hasNextInt()) {
							value = myScnner.nextInt();
							stack.push(value);
							myScnner.nextLine();
							break;
						} else {
							System.out.println("Input invalid! Please enter grade.");
							myScnner.nextLine();
						}
					} catch (Exception e) {
						System.out.println("Input invalid! Please enter grade.");
						myScnner.nextLine();
					}
				}

				System.out.println("**********************************************");
				break;
			case 8:
				if (!stack.empty()) {
					System.out.println(stack.peek() + " was removed.");
					stack.pop();
				} else {
					System.out.println("Nothing to remove beacuse stack is empty");
				}

				System.out.println("**********************************************");
				break;
			case 9:
				if (!stack.empty()) {
					System.out.println("Stack has value.");
				} else {
					System.out.println("Stack is empty");
				}

				System.out.println("**********************************************");
				break;
			}
		}
	}
}
