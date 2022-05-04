package ObjectClass;

class Rect{
	private int width;
	private int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 논리적 동등 비교를 위해, Object 클래스의 equals 메소드 오버라이딩
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if(width*height == p.width*p.height)
			return true;
		else
			return false;
	}
}
public class EqualsEx {

	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		// equals 메소드로 넓이 비교
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
		if(b.equals(c)) {
			System.out.println("b is equal to c");
		}
	}
}
