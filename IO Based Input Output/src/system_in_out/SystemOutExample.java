package system_in_out;

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {
		// System.out 필드는 PrintStream 타입의 출력 스트림
		// 아스키 코드를 출력하면 콘솔에는 문자가 출력
		// 문자열을 출력하려면 바이트 배열을 얻어야 됨
		OutputStream os = System.out;
		
		for(byte b=48; b<58; b++) {
			os.write(b);
		}
		os.write(10); // \n
		
		for(byte b=97; b<123; b++) {
			os.write(b);
		}
		os.write(10);
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}
}
