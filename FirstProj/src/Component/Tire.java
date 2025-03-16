package Component;

public class Tire {
	private int size;

	public Tire() { //생성자(Tire)의 특징 : 클래스와 이름이 같다, 리턴 타입이 없다
		System.out.println("Tire Constructor");
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) { //setSize = 메서드
		this.size = size;
	}

}
