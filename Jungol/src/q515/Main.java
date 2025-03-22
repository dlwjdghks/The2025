package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		//1. println()
		// + 연산자는 문자열 타입을 붙이는 연산자
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		
		//2. printf()
		//%d 안에 정수값이 들어갈건데, 그대로 출력된다.
		System.out.printf("%d / %d = %d\n" , num1, num2 , num1 / num2, args);
		
		/*
		 *  int : %d
		 *  char : %c
		 *  String : %s
		 *  double : %f
		 *  \ 역슬래시는 다음 줄로 이동
		 */
		
	}

}
