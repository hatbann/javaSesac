package java_230304;

public class Bus extends Vehicle{

	public Bus(int numberOfWheel, int passengers) {
		super(numberOfWheel, "버스", passengers);
	}
	
	public void drive() {
		super.drive();
		System.out.println("버스는 시속 50km로 달립니다");
	}
	

}
