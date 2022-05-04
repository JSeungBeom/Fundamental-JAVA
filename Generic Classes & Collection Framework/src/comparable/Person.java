package comparable;

public class Person implements Comparable<Person> {
	// �ʵ�
	public String name;
	public int age;
	
	// ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Comparable �������̽��� compareTo �޼ҵ带 ������
	// TreeSet�̳� TreeMap�� ��ü�� ������ ��, � ���� �������� ������ �������� ��������� ��.
	// �ƴϸ� Exception �߻�
	@Override
	public int compareTo(Person o) {
		if(age < o.age)
			return -1;
		else if(age == o.age)
			return 0;
		else
			return 1;
	}
}
