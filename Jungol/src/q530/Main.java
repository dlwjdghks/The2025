package q530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		
		//System.out.println(age);
		
		if(age >= 20) { 
			// 20살 이상일 경우
			System.out.println("adult");
		}else {
			// 20살 미만인 경우
			int later = 20 - age;
			System.out.println(later + " years later");
		}	

	}

}
