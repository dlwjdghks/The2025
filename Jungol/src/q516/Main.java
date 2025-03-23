package q516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		char c = sc.next().charAt(0);
		// char c = sc.next().charAt(0); 문자열 중 제일 첫 번째 문자를 빼온다? 출력한다?
		sc.close();
		
		System.out.printf("%.2f\n", d1);
		System.out.printf("%.2f\n", d2);
		// .2 소수점 둘 째 자리 까지 출력
		System.out.println(c);
		
		/*
		 *  int : %d
		 *  char : %c
		 *  String : %s
		 *  double : %f
		 *  \ 역슬래시는 다음 줄로 이동
		 */

	}

}
