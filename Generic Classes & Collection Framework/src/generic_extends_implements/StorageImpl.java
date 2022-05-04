package generic_extends_implements;

// Storage�� ���� Ŭ����
// ���׸� �������̽��� ���� Ŭ���� ���� ���׸� Ÿ���̴�
public class StorageImpl<T> implements Storage<T> {
	// �ʵ�
	private T[] array;
	
	// ������
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}
	
	/// �߻� �޼ҵ带 ������ 
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	
	@Override
	public T get(int index) {
		return array[index];
	}
}
