package sec08.exam01_method_declaration;

public class Calculator {
	// default ������
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	} 
	
	// �� ���� ���� �����ϴ� �޼ҵ�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	} 
	
	// �� ���� ������ ����� �����ϴ� �޼ҵ�
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	} 
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	// �޼ҵ�
}
