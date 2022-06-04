package Wrapper;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		text = "홍길동/이수홍/박연수";
		
		// delimiter /를 기준으로 토큰 저장
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens(); // 토큰의 수 반환
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken(); // 다음 토큰 리턴
			System.out.println(token);
		}
		
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) { // 토큰이 남았다면 true, 아니면 false
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
