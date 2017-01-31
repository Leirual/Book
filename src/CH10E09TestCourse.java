
public class CH10E09TestCourse {

	public static void main(String[] args) {
		
		CH10E09Course course1 = new CH10E09Course();
		
		course1.addStudent("1");
		course1.addStudent("2");
		course1.addStudent("3");
		course1.addStudent("2");
		course1.addStudent("3");
		course1.addStudent("2");
		
		course1.dropStudent("3");
		course1.dropStudent("3");
		
		String[] students = course1.getStudents();
		for(int i=0; i<course1.getNumberOfStudents(); i++){
			System.out.println(students[i] + " ");
		}
	}
}

