package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		// Up-casting�� ����, Parent Ÿ���� ���� ���� parent�� child ��ü�� ����Ų��.
		Parent parent = child; 
		
		// parent�� method1
		parent.method1();
		// Child Ŭ�������� Overriding(������)�� �޼ҵ尡 ȣ��
		parent.method2();
		
		// parent.method3(); Child Ŭ������ Overriding���� ���� �޼ҵ忡�� ������ �Ұ�
	}

}
