package sec02.exam01_if;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		// Math.random() 함수는 0 ~ 1의 실수를 랜덤으로 생성
		// 결과적으로 Math.random()*20은 0 <= x < 20의 난수를 생성
		// 이에 (int)로 casting하면 0~19의 난수가 생성, +81으로 최종적으로 81 ~ 100의 난수 생성
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} // score가 95 이상인 경우
			else {
				grade = "A";
			} // score가 90 이상, 95 미만인 경우
		} else {
			if(score>=85) {
				grade = "B+";
			} // score가 85이상 90 미만인 경우
			else {
				grade = "B";
			} // score가 85 미만인 경우
		}
		System.out.println("학점: " + grade);
	}

}
