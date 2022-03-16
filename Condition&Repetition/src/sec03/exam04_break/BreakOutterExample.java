package sec03.exam04_break;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				} // break문을 통하여 한번에 for문 여러 개를 탈출할 수 있다.
				// c++의 goto와 비슷한 문법
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
