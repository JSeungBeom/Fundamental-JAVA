package sec04.exam06_scanner;
import java.util.Scanner;
//Scanner ��ü�� ����ϱ� ����, java.util.Scanner Ŭ���� import

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		// ���� ��ū�� ���ڿ��� ����
		System.out.print("�̸��� " + name + ", ");
		String city = scanner.next();
		System.out.print("���ô� " + city + ", ");
		int age = scanner.nextInt();
		// ���� ��ū�� int Ÿ������ ����
		System.out.print("���̴� " + age + ", ");
		
		double weight = scanner.nextDouble();
		// ���� ��ū�� double Ÿ������ ����
		System.out.print("ü���� " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean();
		// ���� ��ū�� boolean Ÿ������ ����
		System.out.print("���� ���δ� " + single + "�Դϴ�.");
		
		scanner.close();
		//scanner�� ��� ����
	}

}
