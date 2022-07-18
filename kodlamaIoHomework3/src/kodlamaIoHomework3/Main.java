package kodlamaIoHomework3;


public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setPassword("123456");
		instructor.setLessonName("Java");
		
		InstructorManager ýnstructorManager = new InstructorManager();
		ýnstructorManager.add();
		ýnstructorManager.login(instructor);
		ýnstructorManager.update();
		ýnstructorManager.remove();
		
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Zehra");
		student.setLastName("Özcanoðullarý");
		student.setEmail("ozcanoðullarizehra@gmail.com");
		student.setPassword("123789");
		student.setLessonName("Java");
		student.setIzlemeOraný(22);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		studentManager.takeLesson();
		
		
		UserManager userManager = new UserManager();
		User[] users = {instructor, student};
		userManager.logins(users); 
		
		 
		
	}

}
