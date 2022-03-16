package sec02.exam02_switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
				// grade가 A이거나 a인 경우 출력 후 switch문을 빠져나간다
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
				// grade가 B이거나 b인 경우 출력 후 switch문 탈출
			default:
				System.out.println("손님입니다.");
				// A,a 또는 B,b 둘다 아닌 경우 출력
		}
	}

}
