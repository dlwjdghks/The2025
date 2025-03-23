package Java4.p38;

// trim은 양 옆의 끝 공백만 제거하고 출력해준다.
public class Main {

	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "123  ";
		String tel3 = "  45  67  ";
		
		System.out.println(tel1 + tel2 + tel3);
		System.out.println(tel1.trim() + tel2.substring(0) + tel3.trim());
	}

}
