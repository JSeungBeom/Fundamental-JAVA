package sec06.exam08_advanced_for;
import java.util.Scanner;

public class AdvancedForExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int scores[] = new int[5]; // 크기 5의 int 타입 배열 생성
		
		for(int i = 0; i < 5; i++) {
			scores[i] = scanner.nextInt();
		} // 배열에 각 요소들을 입력
		
		int sum = 0; // 각 요소들의 합을 구할 변수
		
		for(int score : scores) {
			sum += score;
		} // Advanced for문(for-each문), score라는 변수가 scores 배열의 각 원소에 순차적으로 접근
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double)sum/ scores.length; // int 타입 변수 sum을 double 타입으로 promotion
		System.out.println("점수 평균 = " + avg);
	}

}
