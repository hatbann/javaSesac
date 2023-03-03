package java_230302;

public class Person {
	private String name;
	private int age;
	
	//생성자
	public Person(String name, int age) {
		System.out.println("환영합니다");
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public void myname() {
		System.out.println("my name is " + this.name);
	}
	
	public void myage() {
		System.out.println("I'm " + this.age);
	}
	
	//getter & setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
