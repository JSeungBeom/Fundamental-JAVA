package generic_extends_implements;

// Storage의 구현 클래스
// 제네릭 인터페이스의 구현 클래스 또한 제네릭 타입이다
public class StorageImpl<T> implements Storage<T> {
	// 필드
	private T[] array;
	
	// 생성자
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}
	
	/// 추상 메소드를 재정의 
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	
	@Override
	public T get(int index) {
		return array[index];
	}
}
