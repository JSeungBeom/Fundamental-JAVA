package objectinputstream_outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// 객체 입출력 보조 스트림, 객체를 파일 또는 네트워크로 입출력할 수 있는 기능 제공
		// 객체 직렬화 : 객체는 문잦가 아니므로 바이트 기반 스트림으로 데이터 변경 필요
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(10);
		oos.writeObject(3.14);
		oos.writeObject(new int[]{1,2,3});
		oos.writeObject(new String("홍길동"));
		
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
		
		
	}

}
