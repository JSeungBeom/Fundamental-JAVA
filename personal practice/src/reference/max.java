package reference;
import java.util.Scanner;
public class max {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i]	= scanner.nextInt();
		}
		int max = intArray[0];
		for(int i = 1; i < intArray.length; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		scanner.close();
	}
}
