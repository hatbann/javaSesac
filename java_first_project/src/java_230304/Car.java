package java_230304;

public class Car extends Vehicle{

	public Car(int numberOfWheel, int passengers) {
		super(numberOfWheel, "승용차", passengers);
		// TODO Auto-generated constructor stub
	}
	
	public void drive() {
		super.drive();
		System.out.println("승용차는 시속 60km로 달립니다");
	}

}
