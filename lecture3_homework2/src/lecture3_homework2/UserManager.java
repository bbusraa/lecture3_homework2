package lecture3_homework2;

public class UserManager {
public void add (User user) {
		
		System.out.println(user.userName + "Kiþi Eklendi" );
		
	}
	
public void addMultiple(User[] users) {
		
		for(User user : users) {
			add(user);
		
		}
	}
}
