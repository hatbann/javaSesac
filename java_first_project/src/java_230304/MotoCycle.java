package java_230304;

public class MotoCycle extends Vehicle{

	public MotoCycle(int numberOfWheel, int passengers) {
		super(numberOfWheel, "오토바이", passengers);
		// TODO Auto-generated constructor stub
	}
	
	public void drive() {
		super.drive();
		System.out.println("오토바이는 시속 70km로 달립니다");
	}

}
