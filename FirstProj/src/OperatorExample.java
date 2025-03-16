
public class OperatorExample {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				continue;
			
			System.out.println(i);
			
		}

	}

}
/*
if (i % 2 == 0)
1~10 중 홀수만

if (i % 2 != 0)
1~10 중 짝수만

*/