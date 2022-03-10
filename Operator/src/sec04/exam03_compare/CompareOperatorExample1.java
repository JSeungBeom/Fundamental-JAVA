package sec04.exam03_compare;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		// int 타입의 대소 비교 결과를 boolean 타입 변수에 저장하여 출력
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4=" + result4);
		// char 타입은 내부적으로는 int 타입이므로 대소 비교가 가능하다
	}

}
