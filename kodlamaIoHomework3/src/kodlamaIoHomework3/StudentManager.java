package kodlamaIoHomework3;

public class StudentManager extends UserManager{
	
    @Override
	public void login(User user) {
		System.out.println(user.getFirstName()+ " "+ user.getLastName()+ " Öðrencisinin  giriþi yapýldý.");
	}
	
	public void takeLesson() {
		System.out.println("Derse kayýt yapýldý.");
	}
}
