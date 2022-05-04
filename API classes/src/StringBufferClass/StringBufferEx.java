package StringBufferClass;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil"); // 문자열 덧붙이기
		System.out.println(sb);
		
		// end index는 실제 end index가 아니라 그 앞의 index를 가리킴을 유의
		sb.insert(7, " my"); // "my" 문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // "my"를 "your"로 변경
		System.out.println(sb);
		
		sb.delete(8, 13); // "your" 삭제
		System.out.println(sb);
		
		sb.setLength(4); // 스트링 버퍼 내 문자열 길이 수정
		System.out.println(sb);
	}
}

/*
 * 가변 크기의 문자열 저장 클래스, String 클래스오 달리 문자열을 변경 가능하다.
 * 객체의 크기는 스트링 길이에 따라 가변적
 */
