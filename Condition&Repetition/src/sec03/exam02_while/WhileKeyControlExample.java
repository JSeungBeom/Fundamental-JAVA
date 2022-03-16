package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("------------------------");
				System.out.println("선택: ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) {
				speed++;
				System.out.println("현재 속도=" + speed);
			} // 1을 입력받았을 때, 속도가 빨라진다
			else if(keyCode == 50) {
				speed--;
				System.out.println("현재 속도=" + speed);
			} // 2를 입력받았을 때, 속도가 줄어든다
			else if(keyCode == 51) {
				run = false;
			} // 3을 입력받았을 때 run = false가 되면서 while문 탈출
		}
		System.out.println("프로그램 종료");
	} // 고유한 keyCode로 입력 받은 숫자를 인식

}
