package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		int num = 0;
//		while (num < 10) {
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt();
//		}
//
		
//		System.out.println("종료되었습니다!");

		
		//교수님 Ver.
		// 1. 입력 받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 2. 정수입력 : 출력하기
		int num = 0;
//		while (num < 10) {
//			System.out.println("정수 입력 : ");
//			// 3. 정수 입력받기
//			num = sc.nextInt();
//		}
//		// 2~3 구간이 반복!! 10보다 큰수를 입력하면 종료!
//		System.out.println("종료되었습니다!");
		
		//교수님 2nd.ver. 무한반복문
		while(true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			if(num >= 10) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		

	}

}
