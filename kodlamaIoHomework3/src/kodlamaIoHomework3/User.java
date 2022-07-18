package kodlamaIoHomework3;

public class User {
	int id;
	String FirstName;
	String lastName;
	String password;
	String email;
	String lessonName;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String password, String email, String lessonName) {
		super();
		this.id = id;
		this.FirstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.lessonName = lessonName;
	}
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

}
