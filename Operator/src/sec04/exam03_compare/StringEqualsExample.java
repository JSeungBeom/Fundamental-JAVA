package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "dlwlrma";
		String strVar2 = "dlwlrma";
		// 두 string 변수는 같은 객체를 가리킴
		String strVar3 = new String("dlwlrma");
		// new를 통하여, strVar3에는 새로운 객체 "dlwlrma"을 할당
		System.out.println(strVar1 == strVar2); 
		// 비교 결과 true
		System.out.println(strVar1 == strVar3);
		// 비교 연산은 두 객체가 같은지 비교.
		// 따라서 strVar1과 strVar3는 다른 객체이므로 false를 리턴
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		//equals method를 통하여, 문자열 간의 비교를 수행.
	}

}
