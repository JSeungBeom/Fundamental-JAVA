package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		int intvalue = 44032;
		char charvalue = (char) intvalue;
		System.out.println(charvalue);
		// 4바이트 int 타입을 2바이트 char 타입으로 casting
		
		long longvalue = 500;
		intvalue = (int) longvalue;
		System.out.println(intvalue);
		// 8바이트 long 타입을 4바이트 int 타입으로 casting
		
		double doublevalue = 3.14;
		intvalue = (int)doublevalue;
		System.out.println(intvalue);
		// 8바이트 double 타입을 4바이트 int 타입으로 casting
	}
}

// casting을 하는 과정에서 데이터의 손실이 일어날 가능성이 있다.