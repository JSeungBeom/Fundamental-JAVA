package sec08.exam01_method_declaration;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer(); // ��ü ����

		int[] values1 = {1,2,3}; // �迭 ����
		int result1 = myCom.sum1(values1); // �迭�� ���ڷ� �Ѱ��ش�
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5}); // �迭�� �����Ͽ� ���ڷ� �Ѱ��ش�
		System.out.println("result2: " + result2);
		
		int result3 = myCom.sum2(1, 2, 3); // ������ ���ڷ� �Ѱ��ش�
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5); // ���� ������ ��� ����
		System.out.println("result4: " + result4);
	}

}
