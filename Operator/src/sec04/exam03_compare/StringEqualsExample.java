package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "dlwlrma";
		String strVar2 = "dlwlrma";
		// �� string ������ ���� ��ü�� ����Ŵ
		String strVar3 = new String("dlwlrma");
		// new�� ���Ͽ�, strVar3���� ���ο� ��ü "dlwlrma"�� �Ҵ�
		System.out.println(strVar1 == strVar2); 
		// �� ��� true
		System.out.println(strVar1 == strVar3);
		// �� ������ �� ��ü�� ������ ��.
		// ���� strVar1�� strVar3�� �ٸ� ��ü�̹Ƿ� false�� ����
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		//equals method�� ���Ͽ�, ���ڿ� ���� �񱳸� ����.
	}

}
