package generic_wildcard;

public class Person {
	// �ʵ�
	private String name;
	
	// ������
	public Person(String name) {
		this.name = name;
	}
	
	// �޼ҵ�
	public String getName() {
		return name;
	}
	
	// Object Ŭ������ toString �޼ҵ� ������
	public String toString() {
		return name;
	}
}
