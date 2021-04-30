package lecture3_homework2;

public class StudentManager {
	public void add (Student student) {
	
		System.out.println(student.userName + "Öğrenci Eklendi" );
		
	}

	public void addMultiple(Student[] students) {
		
		for(Student student : students) {
			add(student);
		
		}
	}
}
