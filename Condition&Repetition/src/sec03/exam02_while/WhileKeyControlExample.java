package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("------------------------");
				System.out.println("����: ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) {
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} // 1�� �Է¹޾��� ��, �ӵ��� ��������
			else if(keyCode == 50) {
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} // 2�� �Է¹޾��� ��, �ӵ��� �پ���
			else if(keyCode == 51) {
				run = false;
			} // 3�� �Է¹޾��� �� run = false�� �Ǹ鼭 while�� Ż��
		}
		System.out.println("���α׷� ����");
	} // ������ keyCode�� �Է� ���� ���ڸ� �ν�

}
