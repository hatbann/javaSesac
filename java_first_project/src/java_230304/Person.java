package java_230304;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("사람 클래스의 인스턴스 생성됨");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("사람 클래스의 인스턴스 생성됨2");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public void sleep() {
		System.out.println("쿨쿨 잠자기");
	}
	

	
	
	
}
