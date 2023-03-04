package java_230304;

public class Vehicle {
	private int numberOfWheel;
	private String type;
	private int passengers;
	
	/*생성자*/
	public Vehicle(int numberOfWheel, String type, int passengers) {
		this.numberOfWheel = numberOfWheel;
		this.type = type;
		this.passengers = passengers;
	}
	
	/*Getter & Setter*/
	public int getNumberOfWheel() {
		return numberOfWheel;
	}
	
	public void setNumberOfWheel(int numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	public void drive() {
		System.out.println("자동차가 달리기 시작합니다");
	}
	
	public void introduce() {
		System.out.println("이것은 " + this.type + "입니다");
		System.out.println("총 " + this.passengers + "명을 태울 수 있습니다");
	}
	
	
}
