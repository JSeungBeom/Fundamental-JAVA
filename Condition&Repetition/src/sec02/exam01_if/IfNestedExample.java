package sec02.exam01_if;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		// Math.random() �Լ��� 0 ~ 1�� �Ǽ��� �������� ����
		// ��������� Math.random()*20�� 0 <= x < 20�� ������ ����
		// �̿� (int)�� casting�ϸ� 0~19�� ������ ����, +81���� ���������� 81 ~ 100�� ���� ����
		System.out.println("����: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} // score�� 95 �̻��� ���
			else {
				grade = "A";
			} // score�� 90 �̻�, 95 �̸��� ���
		} else {
			if(score>=85) {
				grade = "B+";
			} // score�� 85�̻� 90 �̸��� ���
			else {
				grade = "B";
			} // score�� 85 �̸��� ���
		}
		System.out.println("����: " + grade);
	}

}
