package WrapperClass;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; // �ڵ� �ڽ� (auto boxing)
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10; // �ڵ� ��ڽ� (auto unboxing)
		System.out.println("m = " + m);
	}
}

/*
 * �ڽ�(boxing) : �⺻ Ÿ���� ���� Wrapper ��ü�� ��ȯ
 * ��ڽ�(unboxing) : Wrapper ��ü�� ��� �ִ� �⺻ Ÿ���� ���� ������ ��
 */
