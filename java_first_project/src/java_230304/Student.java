package java_230304;

public class Student extends Person {
	private String studentID;

	public Student() {
		super();
		System.out.println("학생 클래스 인스턴스 생성됨");
	}
	
	public Student(String name, int age) {
		super(name, age);
		System.out.println("학생 클래스 인스턴스 생성됨2");
	}
	
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public void sleep() {
		System.out.println("학생이 잠자기");
	}
	
	public void study() {
		System.out.println("공부하기");
	}
}
