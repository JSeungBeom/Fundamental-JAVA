package generic_method;

// 타입 파라미터 K, V를 가지는 제네릭 타입(클래스)
// 선언 시 클래스 또는 인터페이스 뒤에 <> 사이 타입 파라미터 기술
public class Pair<K, V> {
	// 필드
	private K key;
	private V value;
	
	// 생성자
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	// 메소드
	// Setter
	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	// Getter
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
