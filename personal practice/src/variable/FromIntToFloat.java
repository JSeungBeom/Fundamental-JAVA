package variable;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // int Ÿ�� -> float Ÿ��
		System.out.println(num3);
		num2 = (int) num3; // floatŸ�� -> int Ÿ��
		System.out.println(num2);
		
		int result = num1 - num2; 
		System.out.println(result);
	}

}