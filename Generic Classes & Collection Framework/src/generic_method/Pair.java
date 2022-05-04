package generic_method;

// Ÿ�� �Ķ���� K, V�� ������ ���׸� Ÿ��(Ŭ����)
// ���� �� Ŭ���� �Ǵ� �������̽� �ڿ� <> ���� Ÿ�� �Ķ���� ���
public class Pair<K, V> {
	// �ʵ�
	private K key;
	private V value;
	
	// ������
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	// �޼ҵ�
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
