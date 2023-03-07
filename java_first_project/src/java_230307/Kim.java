package java_230307;

public class Kim extends Student {
	
	//생성자
	public Kim(String name, String school, int age, int stuNum) {
		super(name, school, age, stuNum);
		// TODO Auto-generated constructor stub
	}

	//오버라이딩
	@Override
	public void todo() {
		System.out.println("점심은 김가네 김밥");
	}
}
