package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		// �θ� Ÿ���� parent ���� ������ Child ��ü�� Up-casting�Ͽ� ����
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 parent.field2 = "data2";
		 parent.method3();
		 �ڽ� Ŭ������ Overriding���� ���� �޼ҵ�� ������ �Ұ�
		 */
		
		// Up-casting �Ǿ��� parent�� �ٽ� down-casting 
		Child child = (Child) parent;
		// Down-casting�� �Ǿ�����, Child Ŭ������ ����� ��� ����
		child.field2 = "yyy";
		child.method3(); 
	}

}
