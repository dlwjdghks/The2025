package ForSum;

public class ForSumExample {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		
		System.out.println("sum = " + sum);

	}

}
/* 반복문 ()안이 참이면 계속 반복함
 for 조건식, 증감식
 while 초기화식, 증감식
 do while

탈출 조건은 거짓이 될 때 까지 또는 break 문을 만나면

*/