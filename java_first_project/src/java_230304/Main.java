package java_230304;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Person p = new Person("hyebin", 25); Student student1 = new Student("hyebin",
		 * 25);
		 * 
		 * 
		 * System.out.println(student1.getName()); student1.setName("성춘향");
		 * System.out.println(student1.getName()); student1.sleep();
		 */
		/*
		 * Cat cat = new Cat("나비", 3); Dog dog = new Dog("보리", 10);
		 * 
		 * cat.makeSound(); dog.makesound();
		 */
		Bus bus = new Bus(4, 20);
		Car car = new Car(4, 4);
		MotoCycle motocycle = new MotoCycle(2,1);
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(bus);	
		vehicles.add(car);
		vehicles.add(motocycle);
		
		for(Vehicle ele : vehicles) {
			ele.introduce();
			ele.drive();
			System.out.println("=====================================");
		}
	}

	

}
