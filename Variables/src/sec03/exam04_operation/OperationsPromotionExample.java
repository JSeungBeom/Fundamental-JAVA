package sec03.exam04_operation;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
		// byte bytevalue3 = bytevalue1 + bytevalue2;
		int intvalue1 = bytevalue1 + bytevalue2;
		System.out.println(intvalue1);
		//byte Ÿ�� ������ ����������, byteŸ�� ������ �����ϸ� ������ �߹�. int Ÿ�� ������ �����Ͽ��� �Ѵ�
		char charvalue1 = 'A';
		char charvalue2 = 1;
		// char charvalue3 = charvalue1 + charvalue2;
		int intvalue2 = charvalue1 + charvalue2;
		System.out.println("�����ڵ�= " + intvalue2);
		System.out.println("��¹���= " + (char)intvalue2);
		// char Ÿ�Գ����� ����������, charŸ�� ������ �����ϸ� ������ �߻�, int Ÿ�� ������ �����Ͽ��� �Ѵ�
		int intvalue3 = 10;
		int intvalue4 = intvalue3 / 4;
		System.out.println(intvalue4); 
		// int Ÿ���� int Ÿ������ �������Ƿ�, int Ÿ���� ������ ���� ����
		// �Ҽ��� �Ʒ� ���� ���ڴ� ������ ���
		
		int intvalue5 = 10;
		// int intvalue6 = 10 / 4.0; int Ÿ���� double Ÿ������ ���� ���� int Ÿ���� ������ ������ �� ����
		double doublevalue = intvalue5 / 4.0;
		System.out.println(doublevalue);
	}

}
