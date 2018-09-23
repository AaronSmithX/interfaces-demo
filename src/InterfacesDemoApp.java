import java.util.ArrayList;
import java.util.Collections;

public class InterfacesDemoApp {

	public static void main(String[] args) {
		

		Student john = new Student("John", 15);
		Student sally = new Student("Sally", 16);
		Student michael = new Student("Michael", 17);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(sally);
		students.add(john);
		students.add(michael);
		Classroom classroom = new Classroom(students);
		
		for (Student student : classroom) {
			System.out.println(student);
		}
		
		
//		// COMPARABLE INTERFACE DEMO
//		Student john = new Student("John", 15);
//		Student sally = new Student("Sally", 16);
//		Student michael = new Student("Michael", 17);
//		
//		ArrayList<Student> students = new ArrayList<Student>();
//		students.add(sally);
//		students.add(john);
//		students.add(michael);
//
//		System.out.println(students);
//		Collections.sort(students);
//		Collections.reverse(students);
//		System.out.println(students);
		
		
		// .equals() Override Demo
//		StringWrapper one = new StringWrapper("same");
//		String two = "same ";
//		System.out.println(one.equals(two));
	}

}
