package operation;

public class StringEquals {

	public static void main(String[] args) {
		String strVar1 = "dlwlrma";
		String strVar2 = "dlwlrma"; // 두 스트링 참조 변수는 같은 객체를 가리키게 된다.
		String strVar3 = new String("dlwlrma"); // 새로운 객체 생성
		
		System.out.println(strVar1 == strVar2); // 같은 객체를 가리키므로 true
		System.out.println(strVar1 == strVar3); // 다른 객체를 가리키므로 false
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); 
		System.out.println(strVar1.equals(strVar3)); // 문자열을 비교하는 String 객체의 equals 메소드
	}

}
