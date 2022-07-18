package kodlamaIoHomework3;

public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " Giriþ yapýldý.");
	}

	public void logins(User[] users) {
		for (User user : users) {
			login(user);
		}
	}

	

}
