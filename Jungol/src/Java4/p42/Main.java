package Java4.p42;
// split 예시(Java, C)
public class Main {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-Simon";
		
		String[] names = text.split("&|,|-");
		// |(버티컬바)는 또는 이라는 뜻으로 사용 됨
		for (String name : names) {
			System.out.println(name);
		}

	}

}
