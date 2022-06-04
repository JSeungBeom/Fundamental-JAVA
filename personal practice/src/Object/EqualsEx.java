package Object;

public class EqualsEx {
	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		
		if(a == b) // 레퍼런스 비교, false
			System.out.println("a == b");
		if(a.equals(b)) // 논리적 동등 필드값 비교, true
			System.out.println("a is equal to b");
		if(a.equals(c)) // false
			System.out.println("a is equal to c");
	}
}
