package kodlamaIoHomework3;

public class InstructorManager extends UserManager {
	
	@Override
	public void login(User user) {
		System.out.println(user.getFirstName()+" " + user.getLastName()+  " Eðitmenin giriþi yapýldý.");
	}
	public void add() {
		System.out.println("Ders eklendi.");
	}
	public void remove() {
		System.out.println("Ders kaldýrýldý");
	}
	public void update() {
		System.out.println("Ders güncellendi");
	}

}
