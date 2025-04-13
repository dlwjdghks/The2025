package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int num = 1;

		for (int i = 0; i < n; i++) { // 행
			for (int j = 0; j < m; j++) { // 열
				System.out.print(num + " ");
				num = num + 1;
			}
			System.out.println();
		}

	}

}
