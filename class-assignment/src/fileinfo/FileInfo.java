// package fileinfo;

import java.io.File;
import java.io.Reader;
import java.io.FileReader;

public class FileInfo {
	// InputStream, OutputStream 사용 시, 발생하는 예외를 처리해줘야 한다.
	// 1. main 함수에서 throws Exception : 자바 가상 머신(JVM)에서 예외를 처리
	// 2. try-catch 문으로 예외를 직접 처리
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp"); // Temp 디렉토리를 경로로 하는 File 객체 생성
		// 디렉토라에 포함된 파일들을 File 객체 배열로 리턴
		File files[] = dir.listFiles(); 

			for(File filedata : files) { 
			// 만약, file 배열의 요소가 폴더라면, 정보를 출력하지 않고 건너 뜀
			if(filedata.isDirectory())
				continue;
			// getName 메소드로 모든 파일의 이름을 얻어옴
			System.out.println("< " + filedata.getName() + " >");
			Reader is = new FileReader(filedata); // 텍스트 파일로부터 데이터를 읽어오는 객체
			int readCharNo; // read 메소드로부터 리턴되는 데이터의 수를 저장
			
			char cbuf[] = new char[100]; // 텍스트를 임시로 저장할 char 배열
			
			String data = "";
			
			while((readCharNo = is.read(cbuf)) != -1) {
				data += new String(cbuf, 0, readCharNo); 
			}
			System.out.println(data);
		}
	}

}
