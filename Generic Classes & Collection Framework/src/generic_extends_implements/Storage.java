package generic_extends_implements;

// ���׸� �������̽�
public interface Storage<T> {
	// abstract �޼ҵ�
	public void add(T item, int index);
	public T get(int index);
}
