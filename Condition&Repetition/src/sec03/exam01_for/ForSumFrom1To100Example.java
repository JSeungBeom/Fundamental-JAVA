package sec03.exam01_for;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		/*
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		*/
		
		int sum = 0; // 합을 저장할 변수
		
		int i = 0; // i를 for문 내부에 선언함으로써, 증가된 i 값을 사용 가능
		for(i = 1; i <= 100; i++) {
			sum += i;
		} // 1부터 100까지의 합을 sum에 저장
		
		System.out.println("1~" + (i - 1) + " 합 : " + sum);
	}
}
