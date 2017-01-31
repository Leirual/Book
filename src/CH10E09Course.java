
public class CH10E09Course {

	private String courseName;
	private String[] students = new String[3];
	private int numberOfStudents;
	
	public void Course(String courseName){
		this.courseName = courseName;
	}
	
	public void addStudent(String student){
		students[numberOfStudents] = student;
		numberOfStudents++;
		if(numberOfStudents==students.length){
			String[] temp = new String[students.length + 1];
/*			for (int i = 0; i < students.length; i++){
				temp[i] = students[i];
			}*/
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
	}
	
	public String[] getStudents(){
		return students;
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void dropStudent(String student){
		for(int i=0; i<students.length; i++){
			if(student.equals(students[i])){
				for(int j=i; j<students.length-1; j++){
					students[j] = students[j+1];
				}
				break;
			}
		}
		numberOfStudents--;
	}
	
	public void clear(){
		for(int i=0; i<students.length; i++){
			students[i] = null;
		}
	}
	
	
}
