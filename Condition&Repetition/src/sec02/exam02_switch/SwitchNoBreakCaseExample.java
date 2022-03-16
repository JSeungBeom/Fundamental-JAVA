package sec02.exam02_switch;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time=(int)(Math.random()*4) + 8;
		// 8<= ... < 12 사이의 난수를 생성하여 저장
		System.out.println("[현재시간: " + time + " 시]");
		
		 switch(time) {
		 case 8:
			 System.out.println("출근합니다.");
	
		 case 9:
			 System.out.println("회의를 합니다.");
			 
		 case 10:
			 System.out.println("업무를 봅니다.");
			 default:
				 System.out.println("외근을 나갑니다.");
		 } // switch문의 case에 break를 사용하지 않음으로써, 해당 케이스의 밑 케이스들까지 모두 실행
	}

}
