package kodlamaIoHomework3;

public class Student extends User{
	int izlemeOraný;
	
	public Student() {
		
	}

	public Student(int izlemeOraný ) {
		super();
		this.izlemeOraný = izlemeOraný;
	}

	public int getIzlemeOraný() {
		return izlemeOraný;
	}

	public void setIzlemeOraný(int izlemeOraný) {
		this.izlemeOraný = izlemeOraný;
	}
	
}
