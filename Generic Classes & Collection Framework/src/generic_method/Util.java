package generic_method;

public class Util {
	// 매개변수 타입으로 타입 파라미터를 갖는 메소드
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}

/*
 * 제네릭 메소드(Generic Method) : 매개 변수 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드
 * 선언 시, 리턴 타입 앞에 <> 기호를 추가하고 타입 파라미터 기술
 * 타입 파라미터를 리턴 타입과 매개 변수에 사용
 */
