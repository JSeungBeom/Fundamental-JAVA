package sec02.exam01_if;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("������ 100~90 �Դϴ�.");
			System.out.println("����� A �Դϴ�.");
		} // ������ 90 �̻��� ���
		else if(score>=80) {
			System.out.println("������ 80~89 �Դϴ�.");
			System.out.println("����� B �Դϴ�.");
		} // ������ 90 �̸�, 80 �̻��� ���
		else if(score>=70) {
			System.out.println("������ 70~79 �Դϴ�.");
			System.out.println("����� C �Դϴ�.");
		} // ������ 80 �̸�, 70 �̻��� ���
		else {
			System.out.println("������ 70 �̸� �Դϴ�.");
			System.out.println("����� D �Դϴ�.");
		} // ������ 70 �̸��� ���
	}

}
