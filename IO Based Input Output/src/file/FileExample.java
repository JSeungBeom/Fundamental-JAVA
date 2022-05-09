package file;

import java.io.File;

public class FileExample {

	public static void main(String[] args) throws Exception {
		// 파일 시스템의 파일을 표현하는 클래스 File
		// 파일에 대한 정보와 생성 및 삭제 기능 제공
		// 디렉토리 생성, 디렉토리의 파일 리스트를 얻어내는 기능 젝 ㅗㅇ
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/text3.txt");
		
		if(dir.exists() == false)
			dir.mkdirs();
		if(file1.exists() == false)
			file1.createNewFile();
		if(file2.exists() == false)
			file2.createNewFile();
		if(file3.exists() == false)
			file3.createNewFile();
		
		System.out.println(file3);
		System.out.println(file3.getPath()); // 파일의 전체 경로 리턴
		System.out.println(file3.getName()); // 파일의 이름만 리턴
		
		
	}

}
