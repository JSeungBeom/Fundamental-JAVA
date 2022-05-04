package StringTokenizerClass;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// StringTokenizer 객체는 delimiter를 기준으로, 문자열을 구분하여 토큰들을 객체로 저장
		StringTokenizer st = new StringTokenizer("홍길동/징화/홍련/콩쥐/팥쥐", "/");
		while(st.hasMoreTokens()) // 스트링 토크나이저의 토큰이 남아있는지 판단
			System.out.println(st.nextToken()); // 스트링 토크나이저 객체의 다음 토큰을 리턴
	}
}
