package kodlamaIoHomework3;


public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setPassword("123456");
		instructor.setLessonName("Java");
		
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.add();
		ınstructorManager.login(instructor);
		ınstructorManager.update();
		ınstructorManager.remove();
		
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Zehra");
		student.setLastName("Özcanoğulları");
		student.setEmail("ozcanoğullarizehra@gmail.com");
		student.setPassword("123789");
		student.setLessonName("Java");
		student.setIzlemeOranı(22);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		studentManager.takeLesson();
		
		
		UserManager userManager = new UserManager();
		User[] users = {instructor, student};
		userManager.logins(users); 
		
		 
		
	}

}
