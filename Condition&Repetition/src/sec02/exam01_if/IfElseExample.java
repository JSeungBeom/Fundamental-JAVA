package sec02.exam01_if;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		} // score�� 90�̻��� ��� if�� ���� ����
		else {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B �Դϴ�.");
		} // score�� 90�̸��� ��� else�� ���� ���� if(score<90)�� ����
	}

}
