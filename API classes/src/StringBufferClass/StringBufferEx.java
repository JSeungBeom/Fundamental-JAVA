package StringBufferClass;

public class StringBufferEx {
	public static void main(String[] args) {
		// String 클래스와 달리 문자열 변경이 가능, String 클래스와 비교해 연산의 수행시간이 빠르다
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil"); // 문자열 덧붙이기
		System.out.println(sb);
		
		sb.insert(7, " my"); // "my" 문자열 삽입
		System.out.println(sb);
		
		sb.replace(8,  10, "your"); // "my"를 "your"로 변경
		System.out.println(sb);
		
		// delete, replace 메소드 이용 시, end index는 실제 end 인덱스에 있는 문자의 뒤를 가리킨다.
		sb.delete(8, 13); // "your " 삭제
		System.out.println(sb);
		
		sb.setLength(4); // 스트링 버퍼 내 문자열 길이 수정
		System.out.println(sb);
		
	}
}
