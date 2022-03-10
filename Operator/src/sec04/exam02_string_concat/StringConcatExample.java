package sec04.exam02_string_concat;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; // 연산 순서에 따라 뒤의 숫자들이 문자열로 취급된다
		String str4 = 3 + 3.0 + "JDK"; // 연산 순서에 따라 앞의 숫자들이 실수 타입으로 취급된다
		System.out.println(str3);
		System.out.println(str4);
	}
}
