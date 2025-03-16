package q528;
// 정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		System.out.println(num);
		
		// 여기까지 작성 후 -5를 입력하면 그대로 출력 됨
		// if else 문을 활용해 minus 출력해 주기
		
		if(num < 0) {
			System.out.println("minus");
		
		}

	}

}
