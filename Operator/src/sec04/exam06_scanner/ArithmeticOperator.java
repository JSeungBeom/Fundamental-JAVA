package sec04.exam06_scanner;
import java.util.Scanner;
// Scanner 객체를 사용하기 위해, java.util.Scanner 클래스 import

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Scanner 객체 생성
		
		System.out.print("정수를 입력하세요: ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");
		
		scanner.close();
	}

}
