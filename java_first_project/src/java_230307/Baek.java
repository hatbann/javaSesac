package java_230307;

public class Baek extends Student{
	
	//생성자
	public Baek(String name, String school, int age, int stuNum) {
		super(name, school, age, stuNum);
		// TODO Auto-generated constructor stub
	}


	//오버라이딩
	@Override
	public void todo() {
		System.out.println("점심은 백종원 피자");
	}
}
