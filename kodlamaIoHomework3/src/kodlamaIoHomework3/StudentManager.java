package kodlamaIoHomework3;

public class StudentManager extends UserManager{
	
    @Override
	public void login(User user) {
		System.out.println(user.getFirstName()+ " "+ user.getLastName()+ " ��rencisinin  giri�i yap�ld�.");
	}
	
	public void takeLesson() {
		System.out.println("Derse kay�t yap�ld�.");
	}
}
