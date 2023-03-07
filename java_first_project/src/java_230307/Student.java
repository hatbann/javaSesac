package java_230307;

public abstract class Student {
	
	private String name;
	private String school;
	private int age;
	private int stuNum;
	
	
	//생성자
	public Student(String name, String school, int age, int stuNum) {
		this.name = name;
		this.school = school;
		this.age = age;
		this.stuNum = stuNum;
	}

	//getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public abstract void todo();
	
}
