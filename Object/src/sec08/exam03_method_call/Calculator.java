package sec08.exam03_method_call;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	} // 합
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	} // 평균
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	} // 평균 출력
	
	void println(String message) {
		System.out.println(message);
	} // message 출력
	// 메소드
}
