package java_230302;


import java.util.Scanner;
import java.util.ArrayList;
public class Array_ArrayList {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		/*
		 * int[][] arr1 = {{0,1,2}, {3,4,5}}; int[][] arr2 = new int[2][3];
		 * 
		 * for(int[] arr : arr1) { for(int value : arr) { System.out.print(value + " ");
		 * } System.out.println(""); }
		 * 
		 * int num = 0; for(int i =0; i<arr2.length; i++) { for(int j = 0;
		 * j<arr2[i].length; j++) { arr2[i][j] = num; num++; } }
		 * 
		 * 
		 * for(int[] arr : arr2) { for(int value : arr) { System.out.print(value + " ");
		 * } System.out.println(""); }
		 * 
		 */
		
		
		/*
		 * ArrayList<Integer> arr1 = new ArrayList<>(); ArrayList<Integer> arr2 = new
		 * ArrayList<>();
		 * 
		 * System.out.println("arr1 : "+arr1); //맨 뒤에 2 추가 arr1.add(2);
		 * System.out.println("arr1 : "+arr1); //0번째 인덱스에 1 추가 arr1.add(0,1);
		 * System.out.println("arr1 : "+arr1);
		 * 
		 * 
		 * for(int i = 1; i<6; i++) { arr2.add(i); } System.out.println("arr2 : "+arr2);
		 * 
		 * 
		 * //addAll //arr1 요소 뒤에 arr2 추가 arr1.addAll(arr2);
		 * System.out.println("arr1 : "+ arr1);
		 * 
		 * //ArrayList는 length 사용 x, size사용 for(int i = 0; i<arr1.size(); i++) {
		 * System.out.print(arr1.get(i) + " "); //ArrayList는 대괄호안에 인덱스 불가 }
		 * System.out.println("");
		 * 
		 * 
		 * //index , lastIndexOf System.out.println("index of 2 at arr1 : " +
		 * arr1.indexOf(2)); System.out.println("last index of 2 at arr1 : " +
		 * arr1.lastIndexOf(2));
		 * 
		 * //remove , clear arr1.remove(1); //인덱스1의 요소 제거(값제거 x)
		 * System.out.println("arr1 : "+ arr1); arr1.clear();
		 * System.out.println("arr1 : "+ arr1);
		 */
		
		/*실습1
		int[] arr1 = new int[5];
		System.out.println("5개의 정수를 입력하세요");
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i<arr1.length; i++) {
			sum += arr1[i];
		}	
		
		//System.out.println(sum);
		//System.out.println(arr1);
		
		System.out.println("평균은 " + (double)sum/arr1.length);
		*/
		
		
		
		/*
		 * ArrayList<String> arr2 = new ArrayList<>();
		 * 
		 * while(true) { System.out.println("문자를 입력해주세요. : "); String idx =
		 * scanner.nextLine(); if(idx.equals("exit")) { break; }else { arr2.add(idx); }
		 * } for(int i = 0; i<arr2.size(); i++) { System.out.println(arr2.get(i)); }
		 */
		
		
		scanner.close();

	}

}
