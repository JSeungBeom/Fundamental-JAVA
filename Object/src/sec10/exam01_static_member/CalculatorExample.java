package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		// static ����� Ŭ���� ������ ��ü���� �����ϸ鼭 ���
		double result1 = 10 * 10 * Calculator.pi; // static �ʵ� ȣ��
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5); // static �޼ҵ� ȣ��
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
