package sec04.exam07_conditional;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		// ���� ������, �� ���� ? ���1(true) : ���2(false)
		// score�� 90���� ũ�ٸ� A, ���϶�� 80���� ũ�� B, ���ϸ� C�� ����
		System.out.println(score + "����" + grade + "����Դϴ�.");

	}

}
