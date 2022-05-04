package generic_method;

public class CompareMethodExample {

	public static void main(String[] args) {
		// 제네릭 타입의 타입 파라미터를 각각 Integer와 String으로 하는 객체 생성
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		// Pair<Integer, String> p3 = new Pair<>(1, "사과");
		
		// 제네릭 타입 객체들의 필드들을 비교하는 Util 클래스의 제네릭 메소드 호출
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		// 제네릭 타입의 타입 파라미터를 String, String으로 하는 객체 생성
		Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동");
		
		boolean result2 = Util.compare(p3, p4); // 제네릭 메소드 호출
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}

}
