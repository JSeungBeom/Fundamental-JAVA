package sec03.exam04_operation;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
		// byte bytevalue3 = bytevalue1 + bytevalue2;
		int intvalue1 = bytevalue1 + bytevalue2;
		System.out.println(intvalue1);
		//byte 타입 끼리의 연산일지라도, byte타입 변수에 저장하면 에러가 발뱅. int 타입 변수에 저장하여야 한다
		char charvalue1 = 'A';
		char charvalue2 = 1;
		// char charvalue3 = charvalue1 + charvalue2;
		int intvalue2 = charvalue1 + charvalue2;
		System.out.println("유니코드= " + intvalue2);
		System.out.println("출력문자= " + (char)intvalue2);
		// char 타입끼리의 연산일지라도, char타입 변수에 저장하면 에러가 발생, int 타입 변수에 저장하여야 한다
		int intvalue3 = 10;
		int intvalue4 = intvalue3 / 4;
		System.out.println(intvalue4); 
		// int 타입을 int 타입으로 나눴으므로, int 타입의 변수에 저장 가능
		// 소수점 아래 이하 숫자는 버리고 출력
		
		int intvalue5 = 10;
		// int intvalue6 = 10 / 4.0; int 타입을 double 타입으로 나눈 수를 int 타입의 변수에 저장할 수 없다
		double doublevalue = intvalue5 / 4.0;
		System.out.println(doublevalue);
	}

}
