public class Course {
	private String name;
	private Address blank = new Address("", "", "", 0);
	private Student s1 = new Student("", "", blank, blank, 0, 0, 0);
	private Student s2 = new Student("", "", blank, blank, 0, 0, 0);
	private Student s3 = new Student("", "", blank, blank, 0, 0, 0);
	private Student s4 = new Student("", "", blank, blank, 0, 0, 0);
	private Student s5 = new Student("", "", blank, blank, 0, 0, 0);
	private int countStudents = 0;

	public Course (String courseName) {
		name = courseName;
	}

	public void addStudent(Student studentName) {
		if (countStudents == 6) 
			countStudents = 1;
		else
			countStudents++;

		if (countStudents == 1) {
			s1 = studentName;
		} else if (countStudents == 2) {
			s2 = studentName;
		} else if (countStudents == 3) {
			s3 = studentName;
		} else if (countStudents == 4) {
			s4 = studentName;
		} else {
			s5 = studentName;
		}

		//if (countStudents == 5) {
			//System.out.println("You have reached the max limit of students. Adding more will override students now");
		//}
	}

	public double average () {
		double average = 0;
		average = s1.Average() + s2.Average() + s3.Average() + s4.Average() + s5.Average();
		if (countStudents == 0)
			return 0.0;
		average /= countStudents;
		return average;
	}

	public String roll() {
		String result = "";
		if (countStudents == 0)
			return "There are no students in this class";
		if (countStudents >= 1)
			result += s1 + "\n";
		if (countStudents >= 2) 
			result += s2 + "\n";
		if (countStudents >= 3) 
			result += s3 + "\n";
		if (countStudents >= 4)
			result += s4 + "\n";
		if (countStudents == 5)
			result += s5 + "\n";
		return result;	
	}

}
