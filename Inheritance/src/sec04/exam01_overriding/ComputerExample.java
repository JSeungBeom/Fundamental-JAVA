package sec04.exam01_overriding;


public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator(); // ��ü ����
		// �θ� Ŭ�������� ���ǵ� �޼ҵ�
		System.out.println("�� ���� : " + calculator.areaCircle(r));
		System.out.println();
		Computer computer = new Computer();
		// �ڽ� Ŭ�������� ������(Override)�� �޼ҵ�
		System.out.println("�� ���� : " + computer.areaCircle(r));
		
	}

}
