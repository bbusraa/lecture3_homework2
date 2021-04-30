package lecture3_homework2;

public class InstructorManager {
	public void add (Instructor instroctor) {
		
		System.out.println(instroctor.userName + "Öðretmen Eklendi" );
		
	}
	
public void addMultiple(Instructor[] instructors) {
		
		for(Instructor instructor : instructors) {
			add(instructor);
		
		}
	}
}

