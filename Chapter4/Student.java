//********************************************************************
// Student.java
//Author: Lewis/Loftus
//
// Represents a college student.
//********************************************************************
public class Student {
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int Test1, Test2, Test3;
//-----------------------------------------------------------------
// Sets up this Student object with the specified initial values.
//-----------------------------------------------------------------
	public Student (String first, String last, Address home, Address school, int score1, int score2, int score3) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		Test1 = score1;
		Test2 = score2;
		Test3 = score3;
	}

	public Student (String first, String last, Address home, Address school) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		Test1 = 0;
		Test2 = 0;
		Test3 = 0;
	}
//-----------------------------------------------------------------
// Returns this Student object as a string.
//-----------------------------------------------------------------
	public String toString() {
	String result;
	result = firstName + " " + lastName + "\n";
	result += "Home Address:\n" + homeAddress + "\n";
	result += "School Address:\n" + schoolAddress + "\n";
	result += "Test Scores:\n" + Test1 + ", " + Test2 + ", " + Test3 + "\n";
	result += "Test Average:\n" + Average() + "\n";
	return result;
	}

	public int setTestScore(int testNum, int testScore) {
		if (testNum == 3) {
			Test3 = testScore;
			return Test3;
		} else if (testNum == 2) {
			Test2 = testScore;
			return Test2;
		} else {
			Test1 = testScore;
			return Test1;
		}
	}

	public int getTestScore(int testNum) {
		if (testNum == 3) {
			return Test3;
		} else if (testNum == 2) {
			return Test2;
		} else {
			return Test1;
		}
	}

	public double Average() {
		int sum = Test1 + Test2 + Test3;
		return (double) sum / 3;
	}
}
