package sec03.exam03_accuracy;
import java.math.BigDecimal;

public class DoubleAccuracy {

	public static void main(String[] args) {
		double total = 0;
		total += 5.6;
		System.out.println(total);
		total += 5.8;
		System.out.println(total); // 연산 값이 정확하게 출력되지 않음
		
		double num = 0.1;
		for(int i = 0; i < 10000; i++) {
			num += 0.1;
		}
		System.out.println(num); // 연산 값이 정확하게 출력되지 않음
		
		double a = 77.124;
		System.out.println(a*100000); // 연산 값이 정확하게 출력되지 않음
		// 기대 값과 다른 값이 출력되는 이유눈, double 타입이 내부적으로 수를 이진수의 근사치로 저장하기 때문이다.
		BigDecimal x1= new BigDecimal("77.124");
		BigDecimal y1 = new BigDecimal("100000"); 
		// BigDeciaml의 Parenthesis 안에서 문자열의 형태, 즉 ""에 담겨있는 형태여야 정학한 수 출력이 가능
		// BigDeciaml은 Java에서 숫자를 정밀하게 저장, 표현할 수 있는 방법
		System.out.println(x1.multiply(y1)); // 정확한 연산 값이 출력
	}

}
