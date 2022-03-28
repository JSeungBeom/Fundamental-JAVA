
public class RectangleExample {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7); // 직사각형 객체 r
		Rectangle s = new Rectangle(5, 5, 6); // 정사각형 객체 s
		Rectangle t = new Rectangle(1, 1, 10); // 정사각형 객체 t
		
		r.show(); // 사각형 r의 정보 출력
		System.out.println("s의 면적은 " + s.square()); // 사각형 s의 면적 출력
		if(t.contains(r)) {
			System.out.println("t는 r을 포함합니다.");
		}
		if(t.contains(s)) {
			System.out.println("t는 s를 포함합니다.");
		}
	}

}
