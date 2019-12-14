public class CourseTest {
	public static void main(String[] args) {
		Course CS = new Course("CS");
		Address school = new Address("Stuy", "High", "School", 69420);
		Address home = new Address("Same", "Home", "Lazy", 42);
		Student Chew = new Student("Mr.", "Chew", school, home, 0, 50, 100);
		System.out.println("No students yet so the average is: " +  CS.average());
		CS.addStudent(Chew);
		System.out.println("First member of the class!: " + CS.roll());
		System.out.println("Adding more students");
		Student bruh1 = new Student("Bruh", "1", school, home, 10, 20, 15);
		Student bruh2 = new Student("bruh", "2", school, home, 20, 25, 30);
		Student bruh3 = new Student("Bruh", "3", school, home, 40, 50, 60);
		Student bruh4 = new Student("bruh", "4", school, home, 70, 80, 90);
		CS.addStudent(bruh1);
		CS.addStudent(bruh2);
		CS.addStudent(bruh3);
		CS.addStudent(bruh4);
		System.out.println(CS.roll());
		System.out.println("\n" + "\n");
		System.out.println("Printing the class average:" + CS.average());
	}
}
