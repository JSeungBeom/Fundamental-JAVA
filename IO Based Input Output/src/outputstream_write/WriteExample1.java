package outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		// 바이트 기반 출력 스트림의 최상위 클래스 OutputStream
		// 객체를 생성하며 데이터를 내보낼 파일의 경로를 지정
		OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
		byte[] data = "dlwlrma".getBytes(); // String을 바이트 배열로 리턴
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]); // 출력 스트림으로 1바이트 씩 보낸다
		}
		os.flush(); // 버퍼에 잔류하는 모든 바이트 출력
		os.close(); // 출력 스트림 닫기
	}
}
