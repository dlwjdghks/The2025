package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		System.out.println(inp);
		System.out.println(inp.toUpperCase());

		inp = inp.toUpperCase();
		for (int i = 0; i < inp.length(); i++) {
			if ('A' <= inp.charAt(i) && inp.charAt(i) <= 'Z') {
				System.out.println(i);
			}
		}

	}

}
