package sec08.exam01_method_declaration;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	} // �迭�� parameter�� �迭�� ��ҵ��� ���� ���ϴ� �޼ҵ�
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i= 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	} // int Ÿ�� �������� parameter�� �迭�� ���������
	// �޼ҵ�
}
