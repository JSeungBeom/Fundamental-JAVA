package Wrapper;

public class MathEx {
	public static void main(String[] args) {
		System.out.println("�̹��� ����� ��ȣ�� ");
		for(int i = 0; i < 5; i++) {
			System.out.print((int)(Math.random() * 45 + 1) + " ");
			// Math.random()�� 0 ~ 1 �̸��� �Ǽ� �߻�
		}
	}
}
