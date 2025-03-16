package Switch;
// Java에서 switch 문은 주어진 값에 대해 여러 가지 가능한 옵션 중 하나를 선택
public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		// Math는 수학과 관련된, 그 중 random이라는 메서드
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
			break;
		}

	}

}

/* 
0.0 <= x < 1.0


*/ 