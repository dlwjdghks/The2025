package q595;

//문자열을 "Hong Gil Dong"으로 초기화 한 후 3번부터 6번까지의 문자를 차례로 출력하시오.

public class Main {

	public static void main(String[] args) {
		
		String str = "Hong Gil Dong";
		
		/* 첫 번재 방법
		for(int i = 3; i <= 6; i++) {
			char c = str.charAt(i);
			System.out.print(c);
		}
		*/
		
		String sstr = str.substring(3, 7);
		System.out.println(sstr);
		

	}

}
