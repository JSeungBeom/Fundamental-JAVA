package sec07.exam07_instanceof;

public class InstanceofExample {
	// Down-casting�� ��ȿ���� �˻� �� ����
	public static void method1(Parent parent) {
		// parent �Ű������� �����ϴ� ��ü�� Child ���� ����
		if(parent instanceof Child) {
			Child child = (Child) parent; // parent �Ű� ������ Child Ÿ������ down-casting
			System.out.println("method1 - Child�� ��ȯ ����");
		}
		else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	// Down-casting ����
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	public static void main(String[] args) {
		Parent parentA = new Child(); // Parent Ÿ���� Child ��ü�� Up-casting ����
		method1(parentA); // method1 ȣ��
		method2(parentA); // method2 ȣ��
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); // Up-casting ���� ���� Parent Ÿ���� Parent ��ü�� down-casting, ���� �߻�
	}

}
