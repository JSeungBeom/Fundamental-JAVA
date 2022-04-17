package sec03.exam04_break;

public class BreakExample {

	public static void main(String[] args) {
			while(true) {
				int num = (int)(Math.random()*6) + 1;
				// 1 ~ 6의 난수 생성
				System.out.println(num);
				if(num == 6) {
					break;
				}
			}
			System.out.println("프로그램 종료");// num이 6이 나올 때까지, 난수를 num에 저장하면서 출력
	}

}
