import java.util.Scanner;
public class GradeExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner ��ü ����
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>> ");
		int math = scanner.nextInt(); // ���� ���� �Է�
		int science = scanner.nextInt(); // ���� ���� �Է�
		int english = scanner.nextInt(); // ���� ���� �Է�
		
		Grade me = new Grade(math, science, english);
		// Grade Ŭ������ me ��ü ���� �� ������ ȣ��
		System.out.println("����� " + me.average());
		// me ��ü�� average �޼ҵ� ȣ��
	}

}
