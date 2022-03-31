package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		// static 멤버는 클래스 단위로 객체끼리 공유하면서 사용
		double result1 = 10 * 10 * Calculator.pi; // static 필드 호출
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5); // static 메소드 호출
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
