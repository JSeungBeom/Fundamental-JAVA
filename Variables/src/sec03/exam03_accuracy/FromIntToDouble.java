package sec03.exam03_accuracy;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2; // int Ÿ�� num2�� doubleŸ�� num3�� promotion
		num2 = (int) num3; // promotion�� ���� num2�� �ٽ� casting
		
		int result = num1 - num2; // result�� 0�̶��, �������� �ս��� �߻����� ������ Ȯ��
		System.out.println(result);
	}
}
