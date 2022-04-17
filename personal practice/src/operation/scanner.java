package operation;
import java.util.Scanner;

public class scanner {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요:");
		int age = scanner.nextInt();
		System.out.println("나이는 " + age + "입니다.");
	}
}
