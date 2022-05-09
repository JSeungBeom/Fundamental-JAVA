package system_in_out;

import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws Exception{
		InputStream is = System.in; // InputStream 타입의 변수에 System.in 필드 대입
		
		byte[] datas = new byte[100];
		
		System.out.print("이름: ");
		// 한글을 읽을 시, read() 메소드는 1바이트 씩만 읽으므로 범위를 초과
		// 전체 내용을 바이트 배열로 받아 String 객체 생성 후 읽어들어여 함
		int nameBytes = is.read(datas);
		// len에 -2를 하는 이유는 읽어들인 값에 \n\r이 추가되기 때문에, 이를 제외시키는 것임 
		String name = new String(datas, 0, nameBytes-2); //
		
		System.out.print("하고 싶은말: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 하고 싶은말: " + comment);
	}

}
