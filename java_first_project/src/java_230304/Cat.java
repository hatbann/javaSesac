package java_230304;

public class Cat extends Animal{

	public Cat( String name, int age) {
		super("고양이", name, age);
		
	}
	
	public void makeSound() {
		System.out.println(this.getSpecies()+" " +this.getName() +"가 야옹 소리를 낸다");
	}
	
}
