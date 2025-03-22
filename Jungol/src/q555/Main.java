package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ar = new char[10];

//		String str = sc.next();
//		char c = str.charAt(0);
		
		for (int i = 0; i < ar.length; i++) {
			String str = sc.next();
			char c = str.charAt(0);
//			System.out.println(c);
			
			ar[i] = c;
			
		}
		
		sc.close();
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "");
		}
		
//		String str1 = sc.nextLine();
//		System.out.println(str1);
		
		}

}
