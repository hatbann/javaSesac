package java_230302;

import java.util.Scanner;

import test.Hello;

import java.util.ArrayList;


public class Main {


	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*
		 * Person person1 = new Person("hyebin", 25); person1.myname(); person1.myage();
		 */
		
		
		/*
		 * System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요"); int width =
		 * scanner.nextInt(); int height = scanner.nextInt(); Rectangle rectangle = new
		 * Rectangle(width, height); System.out.println(rectangle.area());
		 */
		
		
		/*
		 * Hello hello = new Hello();
		 * 
		 * hello.hello();
		 */
		
		/*
		 * Person person1 = new Person("hyebin", 25);
		 * 
		 * person1.setName("cho"); person1.setAge(24);
		 * 
		 * System.out.println("이름 : " + person1.getName() + " 나이는 : " +
		 * person1.getAge());
		 * 
		 */
		
		//실습
		
		
		  ArrayList<Rectangle> recArr = new ArrayList<>();
		  
		  while(true) { 
			  System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
			  int idxWidth = scanner.nextInt();
			  int idxHeight = scanner.nextInt();
			  if(idxWidth == 0 && idxHeight == 0) {
				  break; 
			  } 
			  else { 
				  Rectangle idxRec = new Rectangle(idxWidth); 
				  idxRec.setHeigt(idxHeight); 
				  recArr.add(idxRec); 
				  Rectangle.count ++;
				  } 
			  }
		 
		
		  for(Rectangle rectanlgle : recArr) {
			  System.out.println("가로 길이는: " + rectanlgle.getWidth()); 
			  System.out.println("세로 길이는: " + rectanlgle.getHeight()); 
			  System.out.println("넓이는: " +rectanlgle.area());
			  System.out.println("-------------------------------------------"); 
		}
		  
		  
		  System.out.println("개수: " +Rectangle.count);
		

		
		
		
		
		scanner.close();
	}

}
