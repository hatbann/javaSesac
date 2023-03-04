package java_230304;

public class Dog extends Animal{

	public Dog( String name, int age) {
		super("강아지", name, age);
		
	}
	
	public void makesound() {
		System.out.println(this.getSpecies() +" " +this.getName() +"가 멍멍 소리를 낸다");
	}

}
