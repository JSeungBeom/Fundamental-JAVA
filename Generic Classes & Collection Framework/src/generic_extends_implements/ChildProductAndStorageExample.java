package generic_extends_implements;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		// Ÿ�� �Ķ���ͷ� Tv, String, String�� ���� ��ü ����
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv()); // �θ� Ŭ���� �޼ҵ�
		product.setModel("SmartTV"); // �θ� Ŭ���� �޼ҵ�
		product.setCompany("Samsung"); // �ڽ� Ŭ���� �޼ҵ�
		
		// �������̽� Storage Ÿ�� StorageImpl ��ü ����, ũ�� 100�� Tv Ÿ�� �迭 ����
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}

}
