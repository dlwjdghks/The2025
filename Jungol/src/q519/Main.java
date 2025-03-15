package q519;



public class Main {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;
		long Iz1 = (long)x * (long)y;
		long Iz2 = (long)(x * y);
		
		System.out.println(iz);
		System.out.println(Iz1);
		System.out.println(Iz2);
		
	}
}