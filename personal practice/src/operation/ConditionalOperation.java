package operation;

public class ConditionalOperation {

	public static void main(String[] args) {
		int score = 85;
		// ���׿����� ���ǹ� ? true �϶� : false �϶�
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "���� " + grade + "����Դϴ�.");
	}

}
