package for문;

import java.util.Scanner;

public class Ex04구구단 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int anysoo = sc.nextInt();
		
		for(int i = 1; i < anysoo+1 ; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
//		//교수님 Ver.
//		//원하는 단을 입력받아 구구단 출력
//		//1. 입력도구 꺼내기
//		Scanner sc = new Scanner(System.in);
//		//2. 단 입력받기
//		System.out.println("단 입력 : ");
//		int dan = sc.nextInt();
//		//3. 수 입력받기
//		System.out.println("어느 수까지 출력 : ");
//		int su = sc.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
