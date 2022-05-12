package fileIinputstream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// IO Stream을 이용할 떄, try-catch 문으로 예외 처리를 해주거나, main 함수에 throws Exception을
		// 표기하여, 반드시 예외처리를 해야 함
		try {
			// FileInputStream : InputStream의 하위 클래스, 모든 종류의 파일을 바이트 단위로 읽음
			FileInputStream fis = new FileInputStream("C:/FileInputStreamExample.java");
			int data;
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}
	}

}
