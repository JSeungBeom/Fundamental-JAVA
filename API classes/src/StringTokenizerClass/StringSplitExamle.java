package StringTokenizerClass;

public class StringSplitExamle {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-"); // split 메소드로 delimiter 들을 기준으로 String 배열 반환
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}

/*
 * StringTokenizer나 split() 메소드는 raw 데이터들을 정리하고자 할때 사용 가능
 */
