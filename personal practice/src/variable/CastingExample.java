package variable;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue; // int 타입 변수를 char 타입으로 casting
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
/*
 * casting : 더 큰 타입의 변수를 작은 타입의 변수로 쪼개기 명시적으로 casting, 데이터 손실의 우려가 있음
 * int intValue = (int) doubleValue;
 */
