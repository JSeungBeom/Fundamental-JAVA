package sec08.exam01_method_declaration;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	} // 배열을 parameter로 배열의 요소들의 합을 구하는 메소드
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i= 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	} // int 타입 변수들을 parameter로 배열이 만들어진다
	// 메소드
}
