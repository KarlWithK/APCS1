//********************************************************************
// StudentBody.java
//Author: Lewis/Loftus
//
// Demonstrates the use of an aggregate class.
//********************************************************************
public class StudentBody {
//-----------------------------------------------------------------
// Creates some Address and Student objects and prints them.
//-----------------------------------------------------------------
	public static void main (String[] args) {
	Address school = new Address ("800 Lancaster Ave.", "Villanova", "PA", 19085);
	Address jHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);
	Student john = new Student ("John", "Smith", jHome, school, 100, 80, 90);
	Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
	Student marsha = new Student ("Marsha", "Jones", mHome, school);
	marsha.setTestScore(1, 60);
	marsha.setTestScore(2, 40);
	marsha.setTestScore(3, 50);
	System.out.println (john);
	System.out.println ();
	System.out.println (marsha);
	}
}
