package inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	// throws Exception을 통해, 
	// read()에서 throw한 Exception을 main에서 처리하지 않고 다시 throw (폭탄 돌리기)
	public static void main(String[] args) throws Exception{
		// 바이트 기반 입력 스트림의 최상위 클래스 InputStream
		InputStream is = new FileInputStream("C:/Temp/test.txt");
	//  InputStream is = new FileInputStream("C:\\Temp\\test.txt");
    //  백 슬래쉬 사용 경우, 백 슬래쉬 두 개를 사용하여야 표현이 가능 (\t, \r 등과 혼동)
		
		int readByte;
		// int read() : 입력 스트림으로 부터 1 바이트를 읽고 리턴
		while((readByte = is.read()) != -1)  // -1, 즉 EOF가 될 때까지 (코드 상의 -1 != 실제 데이터의 -1)
			System.out.println((char)readByte); // int 타입의 readByte를 char 타입으로 다운 캐스팅
		
		is.close(); // 입력 스트림 닫기
	}
}
