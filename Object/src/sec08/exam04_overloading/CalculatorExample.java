package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator(); // ��ü ����
		
		double result1 = myCalc.areaRectangle(10); // ���簢���� ����
		
		double result2 = myCalc.areaRectangle(10, 20); // ���簢���� ����
		
		System.out.println("���簢�� ����=" +  result1);
		System.out.println("���簢�� ����=" + result2);
	}

}
