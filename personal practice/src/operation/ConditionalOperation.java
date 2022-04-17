package operation;

public class ConditionalOperation {

	public static void main(String[] args) {
		int score = 85;
		// 삼항연산자 조건문 ? true 일때 : false 일때
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
