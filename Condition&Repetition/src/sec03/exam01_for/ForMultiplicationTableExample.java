package sec03.exam01_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "�� ***"); 
			// �� ������ ǥ��
			for(int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			} // 2���̶��, 2 x 1 ~ 2 x 9���� ���
		} // 2�� for���� �̿��� ������ ���
	}

}
