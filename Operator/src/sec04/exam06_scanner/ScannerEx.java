package sec04.exam06_scanner;
import java.util.Scanner;
//Scanner 객체를 사용하기 위해, java.util.Scanner 클래스 import

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		// 다음 토큰을 문자열로 리턴
		System.out.print("이름은 " + name + ", ");
		String city = scanner.next();
		System.out.print("도시는 " + city + ", ");
		int age = scanner.nextInt();
		// 다음 토큰을 int 타입으로 리턴
		System.out.print("나이는 " + age + ", ");
		
		double weight = scanner.nextDouble();
		// 다음 토큰을 double 타입으로 리턴
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean();
		// 다음 토큰을 boolean 타입으로 리턴
		System.out.print("독신 여부는 " + single + "입니다.");
		
		scanner.close();
		//scanner의 사용 종료
	}

}
