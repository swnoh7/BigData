package 변수및자료형;

// 도구를 꺼내올때는 반드시 어디에서 꺼낼지 import라는 구문을 작성해야한다.
// ---> 직접 작성하기보다는 에러에 마우스를 올려서 해결하자.
import java.util.Scanner;

public class Ex01입출력 {

	public static void main(String[] args) {
         // 주석: 코드에 영향을 끼치지 않는 일종의 메모
		 // 단축키
		 // 1) 글자 크기를 늘리기 : ctrl +
		 // 2) 글자 크기를 줄이기 : ctrl -
		 // 3) 한 줄 삭제 : ctrl + d
		 // 4) 실행 : ctrl + f11
		 // 5) 자동 import : ctrl shift o (영문)
		
		 // 1. 출력문
		 // ---> ()안쪽에 출력하고 싶은 구문 작성
		 System.out.println("Hello world!!!!");
		 // 출력문 생성 단축키 : syso -> ctrl + spacebar
		 System.out.println("노승우!!!!");
		 
		 // 2. 입력문
		 // 2-1) 입력받는 도구 꺼내오기
		 Scanner sc = new Scanner(System.in);
		 // 개행(줄바꿈)을 없애고 싶다면 println에서 ln을 지워주기!
		 System.out.print("글자를 입력하세요 >>");
		 // 2-2) 입력받기
		 sc.next();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
