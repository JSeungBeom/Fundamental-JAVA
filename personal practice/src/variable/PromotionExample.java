package variable;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // byte타입 변수가 int 타입으로 promotion
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}

}
/*
 promotion : 더 작은 타입의 변수가 더 큰 타입의 변수로 암시적으로 promotion(승급)
 */
