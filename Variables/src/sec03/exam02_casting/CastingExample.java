package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		int intvalue = 44032;
		char charvalue = (char) intvalue;
		System.out.println(charvalue);
		// 4����Ʈ int Ÿ���� 2����Ʈ char Ÿ������ casting
		
		long longvalue = 500;
		intvalue = (int) longvalue;
		System.out.println(intvalue);
		// 8����Ʈ long Ÿ���� 4����Ʈ int Ÿ������ casting
		
		double doublevalue = 3.14;
		intvalue = (int)doublevalue;
		System.out.println(intvalue);
		// 8����Ʈ double Ÿ���� 4����Ʈ int Ÿ������ casting
	}
}

// casting�� �ϴ� �������� �������� �ս��� �Ͼ ���ɼ��� �ִ�.