package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		// Calculator Ŭ������ myCalc ��ü ����
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); // �޼ҵ� ȣ�� �������� byte Ÿ���� ������ double Ÿ������ �� ��ȯ
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
	}

}
