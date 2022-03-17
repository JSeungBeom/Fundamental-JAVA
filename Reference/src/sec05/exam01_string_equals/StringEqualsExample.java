package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} 
		else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		} // strVar1과 strVar2는 같은 객체를 참조하고 있으므로, 같다고 취급
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} // 단순 문자열을 비교하므로, strVar1과 strVar2의 문자열은 같다
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} 
		else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		} // strVar3과 strVar4는 다른 객체를 참조하고 있으므로, 다르다고 취급
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		} // 단순 문자열을 비교하므로, strVar3와 strVar4는 문자열이 같다
	}

}
