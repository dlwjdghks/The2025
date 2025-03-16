package q514;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력을 받기 위해 Scanner 먼저 정의해 주고
		System.out.print("height = ");
		// 입력 받는 질문 출력
		int height = sc.nextInt();
		sc.close();
		
		System.out.println("Your height is " + height + "cm.");
		// 입력 받고 출력에 대한 질문이 Your height is xxx cm.
		
	}

}

// 비트 연산
// 참과 거짓을 나타내주는 타입 boolean
//boolean result1 = (num1 == num2);
// num1과 num2가 같으면 true를 출력해 줌

// AND 피연산자 모두가 true일 경우에만 true
// OR  피연산자 모두가 false일 경우에만 false

// 0은 거짓(false)은 참(true)
// 비트 중 1이 제일 앞에 있으면 - 수
// 해당 비트 값을 알려면 보수 (0은 1로 1은 0으로)
