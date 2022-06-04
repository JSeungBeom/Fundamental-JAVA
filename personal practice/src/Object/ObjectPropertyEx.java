package Object;

// 모든 클래스는 java.lang 패키지의 Object 클래스를 상속받는다.
class Point{
	// 필드
	private int x,y; 
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() { // Object의 toString 메소드 재정의
		return "Point(" + x + "," + y + ")";
	}
	
	// Object 클래스의 equals 메소드 : 기본적으로는 == 와 동일하게 동작
	// 재정의함으로, 논리적 동등 비교
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) {
			return true;
		}
		else
			return false;
	}
}
public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // 클래스 이름
		System.out.println(obj.hashCode()); // 객체의 해시 코드 값 
		System.out.println(obj.toString()); // 객체를 문자열로 리턴  
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		System.out.println(obj); // toString()이 자동으로 호출
	}
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
		System.out.println(p.toString());
		System.out.println(p); // p는 p.toString()으로 자동 변환
		System.out.println(p + "입니다."); // p.toString() + "입니다"로 자동 변환
	}
}
