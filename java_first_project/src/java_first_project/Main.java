package java_first_project;

import java.util.Scanner;
import java.util.Arrays;


public class Main {

	public static void hello() {
		System.out.println("hello");
	}
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public static void calculate(double num1, double num2) {
		System.out.println("덧셈 결과 : " + (num1+num2));
		System.out.println("뺄셈 결과 : " + (num1-num2));
		System.out.println("나눗셈 결과 : " + (num1/num2));
		System.out.println("곱셈 결과 : " + (num1*num2));
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.print("Hello Wolrd 1");
		System.out.println("Hello Wolrd 2");
		System.out.print("Hello Wolrd 3");
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		
		/*
		System.out.println("이름, 나이, 키, 결혼 여부를 입력해주세요");
		
		String name = scanner.next();
		int age = scanner.nextInt();
		double height = scanner.nextDouble();
		boolean single = scanner.nextBoolean();
		
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age);
		System.out.println("키는 " + height);
		System.out.println("결혼은 " + single);
		
		*/
		
		/*
		System.out.println("아름을 입력하세요");
		String name = scanner.next();
		
		System.out.println("나이를 입력하세요");
		int age = scanner.nextInt();
		
		System.out.println("안녕하세요! " + name + "님(" + age + "세)");
		
		*/
		
		/*
		String str1 = new String("홍길동");
		String str2 = "홍길동";
		
		if(str1 == "홍길동") System.out.println(true);
		else System.out.println(false);
		
		if(str2 == "홍길동") System.out.println(true);
		else System.out.println(false);
		*/

		
		/*
		System.out.println("숫자 입력");
		int num = scanner.nextInt();
		
		switch(num) {
		case 0 : 
			System.out.println("0");
			break;
		case 1: 
			System.out.println("1");
			break;
		default : 
			System.out.println("0도 1도 아닙니다");
		}
		*/
		
		
		/*
		for(int i = 0; i<9; i++) {
			System.out.println(i);
		}
		*/
		
		
		/*
		int i = 10;
		while(i<10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.print("\n");
		
		int j = 10;
		do {
			System.out.print(j + " ");
			j++;
		}while(j < 10);
		
		*/
	
		
		/*
		hello();
		System.out.print(sum(1,2));
		*/
		
		/*실습1*/
		/*
		System.out.println("나이를 입력하세요.");
		int age = scanner.nextInt();

		
		if(age > 0 && age<8) {
			System.out.println("유아");
		}
		else if(age > 7 && age < 14) {
			System.out.println("초등학생");
		}
		else if(age > 13 && age< 17) {
			System.out.println("중학생");
		}
		else if(age > 16 && age < 20) {
			System.out.println("고등학생");
		}
		else {
			System.out.println("성인");
		}
		*/
		
		
		/*실습2*/
		/*
		System.out.println("이름을 입력하세요.");
		String name = scanner.next();
		
		switch(name) {
		case "홍길동" : 
			System.out.println("남자");
			break;
		case "성춘향" : 
			System.out.println("여자");
			break;
		default:
			System.out.println("모르겠어요");
		
		}
		*/
		

		/*실습3*/
		/*
		 * System.out.println("숫자를 입력하세요."); int num = scanner.nextInt();
		 * 
		 * for(int i = 1; i<= num; i++) { System.out.print(i + " "); }
		 * 
		 * System.out.print("\n");
		 * 
		 * System.out.println("숫자를 입력하세요."); double num1 = scanner.nextDouble(); double
		 * num2 = scanner.nextDouble(); calculate(num1, num2);
		 */
		
		int[] arr1 = {0,0,0};
		int[] arr2 = new int[3]; ///크기만 지정
		arr1[0] = 1;
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = i;
		}
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println(Arrays.toString(arr1));
		
		
		for(int value : arr1) {
			System.out.print(value + " ");
		}
		
		scanner.close();

	}


}
