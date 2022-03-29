package sec08.exam01_method_declaration;

public class Calculator {
	// default 생성자
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	} 
	
	// 두 수의 합을 리턴하는 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	} 
	
	// 두 수의 나누기 결과를 리턴하는 메소드
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	} 
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	// 메소드
}
