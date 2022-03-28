import java.util.Scanner;
public class GradeExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner 객체 생성
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
		int math = scanner.nextInt(); // 수학 점수 입력
		int science = scanner.nextInt(); // 과학 점수 입력
		int english = scanner.nextInt(); // 영어 점수 입력
		
		Grade me = new Grade(math, science, english);
		// Grade 클래스의 me 객체 생성 및 생성자 호출
		System.out.println("평균은 " + me.average());
		// me 객체의 average 메소드 호출
	}

}
