package sec02.exam02_switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;
				// grade�� A�̰ų� a�� ��� ��� �� switch���� ����������
			case 'B':
			case 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�.");
				break;
				// grade�� B�̰ų� b�� ��� ��� �� switch�� Ż��
			default:
				System.out.println("�մ��Դϴ�.");
				// A,a �Ǵ� B,b �Ѵ� �ƴ� ��� ���
		}
	}

}
