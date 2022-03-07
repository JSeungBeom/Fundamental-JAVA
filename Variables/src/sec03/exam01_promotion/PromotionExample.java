package sec03.exam01_promotion;

public class PromotionExample {
	public static void main(String args[]) {
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println(intvalue);
		// 1바이트를 사용하는 byte 타입이 4바이트를 사용하는 int 타입으로 promotion
		
		char charvalue = '가';
		intvalue = charvalue;
		System.out.println(intvalue);
		// 2바이트를 사용하는 char 타입이 4바이트를 사용하는 int 타입으로 promotion, 유니코드 출력
		
		intvalue = 500;
		long longvalue = intvalue;
		System.out.println(longvalue);
		// 4바이트를 사용하는 int 타입이 8바이트를 사용하는 long 타입으로 promotion
		
		intvalue = 200;
		double doublevalue = intvalue;
		System.out.println(doublevalue);
		// 4바이트를 사용하는 int 타입이 8바이트를 사용하는 double 타입으로 promotion
	}
}
