package q557;

import java.util.Scanner;

// 10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
// 입력 A B C D E F G H I J 출력 A D G
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 10개의 문자를 입력받을 배열 생성
		char[] inp = new char[10];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = scan.next().charAt(0); // 한 문자씩 입력받음

			/*
			 * String s = scan.next(); inp[i] = s.charAt(0);
			 * 
			 */
		}
		scan.close();

		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");

		}
		System.out.println();

		System.out.print(inp[0] + " ");
		System.out.print(inp[3] + " ");
		System.out.print(inp[6]);

	/*	A B C D E F G H I J 중 짝수에 해당하는 것만 출력하려면 ctrl + shift + F
	 	
	 	for(int i = 1; i < inp.lenght; i += 2) { // i = i = 2;
	 		System.out.print(inp[i] + " ");
	 	}
	 	System.out.println();
	 	
	 	for (int i = 0; i < inp.length; i++) {
	 		if (i % 2 == 0) {
	 			System.out.print(inp[i] + " ");
	 		}
	 	
	
	 */
	}
}