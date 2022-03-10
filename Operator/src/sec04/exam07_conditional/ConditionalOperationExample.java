package sec04.exam07_conditional;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		// 삼항 연산자, 비교 연산 ? 결과1(true) : 결과2(false)
		// score가 90보다 크다면 A, 이하라면 80보다 크면 B, 이하면 C를 저장
		System.out.println(score + "점은" + grade + "등급입니다.");

	}

}
