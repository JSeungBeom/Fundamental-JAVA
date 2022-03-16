package sec02.exam01_if;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} // score가 90이상일 경우 if문 내부 실행
		else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		} // score가 90미만일 경우 else문 내부 실행 if(score<90)과 동일
	}

}
