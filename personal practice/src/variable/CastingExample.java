package variable;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue; // int Ÿ�� ������ char Ÿ������ casting
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
/*
 * casting : �� ū Ÿ���� ������ ���� Ÿ���� ������ �ɰ��� ��������� casting, ������ �ս��� ����� ����
 * int intValue = (int) doubleValue;
 */
