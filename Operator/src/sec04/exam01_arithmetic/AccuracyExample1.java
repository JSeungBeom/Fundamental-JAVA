package sec04.exam01_arithmetic;

public class AccuracyExample1 {
	public static void main(String args[]) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + " 조각이 남는다.");
		// 실수 타입을 이용한 계산은 부정확할 가능성이 높으므로, 사용 안하는 것이 좋다.
	}
}
