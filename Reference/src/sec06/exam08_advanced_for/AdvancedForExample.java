package sec06.exam08_advanced_for;
import java.util.Scanner;

public class AdvancedForExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int scores[] = new int[5]; // ũ�� 5�� int Ÿ�� �迭 ����
		
		for(int i = 0; i < 5; i++) {
			scores[i] = scanner.nextInt();
		} // �迭�� �� ��ҵ��� �Է�
		
		int sum = 0; // �� ��ҵ��� ���� ���� ����
		
		for(int score : scores) {
			sum += score;
		} // Advanced for��(for-each��), score��� ������ scores �迭�� �� ���ҿ� ���������� ����
		
		System.out.println("���� ���� = " + sum);
		
		double avg = (double)sum/ scores.length; // int Ÿ�� ���� sum�� double Ÿ������ promotion
		System.out.println("���� ��� = " + avg);
	}

}
