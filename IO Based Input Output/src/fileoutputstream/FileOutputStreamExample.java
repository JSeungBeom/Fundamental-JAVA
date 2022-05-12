package fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
// throws Exception : JVM에서 예외를 처리
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/Temp/house.jpg";
		String targetFileName = "C:/Temp/house_copy.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		// FileOutputStream : OutputStream의 하위 클래스로, 모든 종류의 데이터를 파일에 바이트 단위로 저장
		FileOutputStream fos = new FileOutputStream(targetFileName);
		// FileOutputStream fos = new FileOutputStream(targetFileName, true); // 파일 내용 끝에 데이터 추가
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush(); // 버퍼에 남아있는 데이터를 모두 출력
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}

}
