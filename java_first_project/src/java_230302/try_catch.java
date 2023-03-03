package java_230302;

import java.util.Scanner;
import java.util.InputMismatchException;

public class try_catch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * int num1 = 5; int num2 = 0;
		 * 
		 * 
		 * try { System.out.println(num1/num2);
		 * 
		 * } catch(ArithmeticException e) { System.out.println("0으로 나눌 수 없습니다"); }
		 * finally { System.out.println("끝"); }
		 */
		
		
		
		/*
		 * try { int num = scanner.nextInt(); System.out.println(num); }
		 * catch(InputMismatchException e) { System.out.println("숫자를 입력해주세요"); }
		 */
		
		int[] arr = {1,2,3,4};
		
		
		try {
			for(int i = 0; i<5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 범위를 벗어났습니다");
		}
		
		scanner.close();
		
		
	

	}

}
