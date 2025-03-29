package q596;

/*
문자열을 입력받고 정수를 입력 받아서 문자열의 맨 뒤부터 정수만큼 출력하는 프로그램을 작성하시오.
만약 입력받은 정수가 문자열의 길이보다 크다면 맨 뒤부터 맨 처음까지 모두 출력한다.
(문자열 길이는 최대 100자 이하이다. )

첫 줄에 문자열과 정수가 공백으로 구분되어 주어진다.
문자열은 100자 이하의 길이를 갖는다.
정수는 1 이상, 200 이하의 값을 갖는다.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); 
		 * String inp = sc.nextLine(); 
		 * int num = sc.nextInt(); 
		 * sc.close();
		 * 
		 * System.out.println();
		 */

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();

//		System.out.println(str);
//		System.out.println(num);

		for (int i = str.length() - 1; i >=0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
		}
		
		System.out.println();
		
		int cnt = 0;
		for (int i = str.length() - 1; cnt < num; i--) {
			char c = str.charAt(i);
			cnt++;
			System.out.print(c);
		}
		
		
/*
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.print(c);
		} 그대로 출력하는 for문
		
		for (int i = str.length() - 1; i >=0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
		} 거꾸로 출력하는 for문
*/
	}

}
