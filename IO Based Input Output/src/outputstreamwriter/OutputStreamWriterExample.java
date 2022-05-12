package outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/file1.txt");
		// 문자 변환 보조 스트림, 소스 스트림이 바이트 기반이지만 데이터가 문자일 경우 사용
		Writer writer = new OutputStreamWriter(fos); // OutputStream 스트림을 인자로 받음
		
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data); // String 타입으로 데이터를 출력 가능 
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");
	}

}
