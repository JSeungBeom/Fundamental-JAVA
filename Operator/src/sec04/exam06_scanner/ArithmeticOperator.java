package sec04.exam06_scanner;
import java.util.Scanner;
// Scanner ��ü�� ����ϱ� ����, java.util.Scanner Ŭ���� import

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Scanner ��ü ����
		
		System.out.print("������ �Է��ϼ���: ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.println(second + "���Դϴ�.");
		
		scanner.close();
	}

}
