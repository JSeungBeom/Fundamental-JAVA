package sec03.exam01_promotion;

public class PromotionExample {
	public static void main(String args[]) {
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println(intvalue);
		// 1����Ʈ�� ����ϴ� byte Ÿ���� 4����Ʈ�� ����ϴ� int Ÿ������ promotion
		
		char charvalue = '��';
		intvalue = charvalue;
		System.out.println(intvalue);
		// 2����Ʈ�� ����ϴ� char Ÿ���� 4����Ʈ�� ����ϴ� int Ÿ������ promotion, �����ڵ� ���
		
		intvalue = 500;
		long longvalue = intvalue;
		System.out.println(longvalue);
		// 4����Ʈ�� ����ϴ� int Ÿ���� 8����Ʈ�� ����ϴ� long Ÿ������ promotion
		
		intvalue = 200;
		double doublevalue = intvalue;
		System.out.println(doublevalue);
		// 4����Ʈ�� ����ϴ� int Ÿ���� 8����Ʈ�� ����ϴ� double Ÿ������ promotion
	}
}
