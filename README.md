


Repo containing the voter validation , retrive data of stack ,hashmap and custom exception
# EXCEPTION HANDLING

Exception

We have 9 operations in our project that assist the librarian in efficiently managing the library.

## Let's begin by explaining the 9 operations.

####  1 -- > Student 

First of all put student details like roll no,age,name and course
In this code, we have defined two exception classes AgeNotWithinRangeException and NameNotValidException. In the Student class, we check if the age is between 15 and 21, and if the name contains only alphabets. 
If these conditions are not met, we throw the respective exceptions. The exceptions can then be caught and handled in the main program where the Student class is used.
## Screenshots

![image](https://github.com/Nagulan-N/CostomizeException/assets/107946841/69c7ac18-b265-4582-a1a4-ef920aba2b0e)


####  2 -- > Voter

Need to put voter details like voter ID,age,name 
In this code, we have defined two exception classes InvalidAgeException . In the vater class, we check if the age is above 18 or not. 
If these conditions are not met, we throw the respective exceptions. The exceptions can then be caught and handled in the main program where the voter class is used.

## Screenshots

![image](https://github.com/Nagulan-N/CostomizeException/assets/107946841/68d9f6ae-7171-441c-a979-84fe3a0f3532)

####  3 -- > Day position: 

In this program, we first store the names of the weekdays in an array. We then need to enter the day position.
If the user enters a number outside the range 0-6, an ArrayIndexOutOfBoundsException will be thrown and caught, and a proper message will be displayed.
If the enters an invalid input (not a number), a general Exception will be caught and an appropriate message will be displayed.
This way, we can ensure that the program doesn’t crash due to invalid input.

## Screenshots

![image](https://github.com/Nagulan-N/CostomizeException/assets/107946841/5c211127-9892-49bb-9acf-d713260d19d0)

####  4 -- > Add Student grade with help of hashmap: 

In this code, we have a StudentGrades class that uses a HashMap to store student names and their corresponding grades.
This method adds a new student to the map.


####  5 -- > Display Student Grade: 

The displayGrade method displays a student’s grade by name.
If the student does not exist in the map, a message is printed indicating that no student was found with the given name.

## Screenshots
![image](https://github.com/Nagulan-N/CostomizeException/assets/107946841/ebad1238-a4dc-4a1f-af08-411d71f7fd2c)
![image](https://github.com/Nagulan-N/CostomizeException/assets/107946841/e360b619-469b-4c30-b25e-dc196772440e)


####  6 -- > Remove Student Grade: 

The removeStudent method removes a student from the map.


