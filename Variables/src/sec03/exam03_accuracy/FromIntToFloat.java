package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // int Ÿ�� num2�� floatŸ�� num3�� promotion
		System.out.println(num3); // float Ÿ���� ������ int Ÿ���� ����� ū ���� �����ϱ⿡ �����Ͽ�, ��Ȯ�� ���� ��µ��� ����
		num2 = (int)num3; // �ٽ� num3�� int Ÿ������ casting
		System.out.println(num2); // ������ ���� �ٸ� ���� ���
		
		int result = num1 - num2; // ����� 0�̶��, �������� �ս��� ������ Ȯ��
		System.out.println(result);

	}

}
