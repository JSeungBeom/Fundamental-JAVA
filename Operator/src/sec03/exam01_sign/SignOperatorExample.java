package sec03.exam01_sign;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		// short result3 = -s // 컴파일 에러
		// 부호 연산자의 산출 타입은 int 타입이므로 short 타입 변수에 저장할 수 없다.
		int result3 = -s;
		System.out.println("result3=" + result3);

	}
}
