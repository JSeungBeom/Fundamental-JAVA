package generic_extends_implements;

// 제네릭 인터페이스
public interface Storage<T> {
	// abstract 메소드
	public void add(T item, int index);
	public T get(int index);
}
