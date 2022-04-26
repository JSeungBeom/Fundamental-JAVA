package ObjectClass;

// Object 클래스가 강제 상속(Object 클래스는 모든 클래스의 슈퍼 클래스, java.lang 패키지에 포함)
class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Object 클래스의 toString() 메소드 오버라이딩
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}
public class ObjectPropertyEx {
	// main 함수가 있는 클래스의 메소드는 모두 public static 타입이어야
	// main 함수에서 객체 생성 없이, 바로 사용이 가능 (main 함수의 특성)
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // 클래스 이름 
		System.out.println(obj.hashCode()); // 해시코드 값
		System.out.println(obj.toString()); // 객체를 문자열로 만들어 출력
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		System.out.println(p.toString());
		System.out.println(p); // p는 p.toString()으로 자동 변환
		System.out.println(p + "입니다."); // p.toString() + "입니다."로 자동변환
		System.out.println();
		print(p); // print 메소드 호출
		System.out.println();
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		if(a == b) // 둘은 다른 객체를 참조하므로 false
			System.out.println("a == b");
		if(a.equals(b)) // 둘의 필드, x, y가 동일하므로 true
			System.out.println("a is equal to b");
		if(a.equals(c)) // 둘의 필드, x, y가 다르므로 false
			System.out.println("a is equal to c");
	}
}
