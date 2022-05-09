// package fileinfo;

import java.io.File;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileInfo {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp"); // Temp 디렉토리를 경로로 하는 File 객체 생성
		// 디렉토라에 포함된 파일들을 File 배열로 리턴
		File files[] = dir.listFiles(); 
		
		for(File filedata : files) {
			// 만약, file 배열의 요소가 폴더라면, 정보를 출력하지 않고 건너 뜀
			if(filedata.isDirectory())
				continue;
			// getName 메소드로 모든 파일의 이름을 얻어옴
			System.out.println("< " + filedata.getName() + " >");
			InputStream is = new FileInputStream(filedata); // 파일의 데이터를 읽어오는 객체
			OutputStream os = System.out; // 콘솔 창에 출력을 위해, OutputStream 타입 System.out 필드 선언
			
			byte[] readBytes = new byte[300]; // 한글을 출력하기 위해, 모든 입력 스트림의 바이트를 저장할 바이트 배열
			int readByteNo = is.read(readBytes); // 바이트 배열에 읽은 바이트들을 저장하고, 읽은 바이트의 수를 리턴
			String data = new String(readBytes, 0, readByteNo); // readBytes 배열의 모든 바이트를 data에 저장
			byte[] hangulBytes = data.getBytes(); // String 타입 data를 byte 배열로 저장
			os.write(hangulBytes); // 모든 바이트 코드를 콘솔에 출력 ( 콘솔에서 문자로 변환되어 출력 )
			os.flush();
			System.out.println();
		}
	}

}
