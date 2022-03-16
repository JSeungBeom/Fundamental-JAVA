package sec02.exam01_if;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		// 1 ~ 6의 난수를 생성하여 num에 저장
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} 
		else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}
		else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}
		else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}
		else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}
		else {
			System.out.println("6번이 나왔습니다.");
		} // 1,2,3,4,5 외에는 6번 밖에 없으므로, 6번을 else문으로 출력
		// 주사위의 눈에 따라 번호를 출력
	}
}
