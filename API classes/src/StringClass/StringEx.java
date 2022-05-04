package StringClass;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "의 길이는 " + a.length()); // 문자열의 길이(문자 개수)
		System.out.println(a.contains("#")); // 문자열의 포함 관계
		
		a = a.concat(b); // 문자열 연결, " C#"이 수정되는 것이 아니라, " C#,C++ "이라는 새로운 문자열이 생성
		System.out.println(a);
		
		a = a.trim(); // 문자열 앞,뒤 공백 제거
		System.out.println(a);
		
		a = a.replace("C#", "Java"); // 문자열 대치
		System.out.println(a);
		
		String s[] = a.split(","); // 문자열을 delimiter "," 로 구분하여 배열 형태로 리턴
		
		for(String st : s) {
			System.out.println("분리된 문자열 : " + st);
		}
		/*
		for(int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" + i + ":" + s[i]);
		}
		*/
		
		a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴
		System.out.println(a);
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴
		System.out.println(c);
		
	}
}
