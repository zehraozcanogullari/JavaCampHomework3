package kodlamaIoHomework3;

public class InstructorManager extends UserManager {
	
	@Override
	public void login(User user) {
		System.out.println(user.getFirstName()+" " + user.getLastName()+  " E�itmenin giri�i yap�ld�.");
	}
	public void add() {
		System.out.println("Ders eklendi.");
	}
	public void remove() {
		System.out.println("Ders kald�r�ld�");
	}
	public void update() {
		System.out.println("Ders g�ncellendi");
	}

}
