package WrapperClass;

public class WrapperEx {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); // 'A'를 소문자로 변환
		char c1='4', c2='F';
		if(Character.isDigit(c1)) // 뮨자 c1이 숫자이면 true
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2)) // 문자 c2가 영문자이면 true
			System.out.println(c2 + "는 영문자");
		
		System.out.println(Integer.parseInt("-123")); // "-123"을 10진수로 변환
		System.out.println(Integer.toHexString(28)); // 정수 28을 16진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28)); // 정수 28을 2진수 문자열로 변환
		System.out.println(Integer.bitCount(28)); // 28에 대한 2진수의 1의 개수
		
		Double d = Double.valueOf(3.14); // Wrapper 클래스 Double 객체 생성
		System.out.println(d.toString()); // Double을 문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14")); // 문자열을 실수 3.14로 변환
		
		boolean b = (4>3); // b는 true
		System.out.println(Boolean.toString(b)); // true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false")); // 문자열을 false로 변환
	}
}

/*
 * Wrapper 클래스는 Primitive 타입을 클래스화(객체화)하는 클래스이다.
 * 이는, 객체에서 사용 가능한 여러 메소드를 사용할 수 있게 해주고,
 *  파라미터 타입이 객체인 메소드에 파라미터로 사용이 가능하게 해준다.
 *  Wrapper 클래스의 메소드들은, 대부분 static 타입이며 자동 박싱과 언박싱을 지원한다.
 */
